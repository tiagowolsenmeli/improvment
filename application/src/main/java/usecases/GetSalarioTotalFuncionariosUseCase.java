package usecases;

import entities.enums.CargoBase;
import entities.funcionario.Funcionario;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import services.SalarioService;


@Service
@AllArgsConstructor
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
  }

  // Mapa com o total de salários por cargo
  // Percorrer tudo, somar no mapa de resultado chave == cargo, valor += salario
  public Map<CargoBase,BigDecimal> executeByCargoBase(List<Funcionario> funcionarioList) {
    return null;
  }

}
