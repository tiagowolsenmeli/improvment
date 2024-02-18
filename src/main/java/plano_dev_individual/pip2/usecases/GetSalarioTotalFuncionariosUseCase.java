package plano_dev_individual.pip2.usecases;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import plano_dev_individual.pip2.entities.Funcionario;
import plano_dev_individual.pip2.entities.cargos.Cargo;
import plano_dev_individual.pip2.entities.enums.CargoBase;
import plano_dev_individual.pip2.services.SalarioService;


@Service
public class GetSalarioTotalFuncionariosUseCase {

  private SalarioService salarioService;

  //TODO Código tem que ser mais poético e semântico
  public Map<String, BigDecimal> execute(List<Funcionario> funcionarioList) {

    Map<String, BigDecimal> mapSalarios = new HashMap<>();

    funcionarioList.forEach(funcionario -> {
      BigDecimal salarioAtual =
          mapSalarios.getOrDefault(funcionario.getCargo().getCargoBase().name(), BigDecimal.ZERO);
      mapSalarios.put(funcionario.getCargo().getCargoBase().name(),
          salarioAtual.add(BigDecimal.ZERO.max(funcionario.getSalarioBruto())));
    });

    return mapSalarios;
  }


  public BigDecimal executeByCargoBase(List<Funcionario> funcionarioList, CargoBase cargoBase) {
    return salarioService
        .getSalarioTotalBrutoFiltered(funcionarioList,
        funcionario -> cargoBase.equals(funcionario.getCargo().getCargoBase()));
  } //Evitar nullPointers

  // Mapa com o total de salários por cargo
  // Percorrer tudo, somar no mapa de resultado chave == cargo, valor += salario
  public Map<CargoBase,BigDecimal> executeByCargoBase(List<Funcionario> funcionarioList) {
    return null;
  }

}
