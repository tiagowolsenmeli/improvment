package improvment.usecases.salario;

import improvment.entities.enums.CargoBase;
import improvment.entities.funcionario.Funcionario;
import improvment.services.SalarioService;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class GetSalarioTotalFuncionariosUseCase {

  private SalarioService salarioService;


  public Map<CargoBase, BigDecimal> execute(List<Funcionario> funcionarioList) {
    Map<CargoBase, BigDecimal> mapSalarios = new HashMap<>();

    funcionarioList.forEach(funcionario -> {
      BigDecimal salarioAtual =
          mapSalarios.getOrDefault(funcionario.getCargo().getCargoBase(), BigDecimal.ZERO);
      mapSalarios.put(funcionario.getCargo().getCargoBase(),
          salarioAtual.add(funcionario.getSalarioBruto()));
    });
    return mapSalarios;
  }

  // Mapa com o total de salários por cargo
  // Percorrer tudo, somar no mapa de resultado chave == cargo, valor += salario
  public Map<CargoBase,BigDecimal> executeByCargoBase(List<Funcionario> funcionarioList) {
    return null;
  }

}
