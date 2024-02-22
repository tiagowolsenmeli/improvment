package improvment.usecases.salario;

import improvment.entities.enums.CargoBase;
import improvment.entities.funcionario.Funcionario;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import improvment.services.SalarioService;


@Service
@AllArgsConstructor
public class GetSalarioTotalFuncionariosGroupByUseCase {

  private SalarioService salarioService;


  public Map<CargoBase, BigDecimal> execute(List<Funcionario> funcionarioList) {

    return returnMapCargoSalarioTotal(funcionarioList);

    //BUSCA NO BANCO
    //CRIA MAPA COM CHAVE CARGO
    //FILTRA SALARIO TOTAL
//    return funcionarioList.stream()
//            .filter(funcionario -> funcionario.getCargo().getCargoBase() != null)
//                .forEach(
//                    funcionario -> {
//                      BigDecimal salarioAtual =
//                          mapSalarios.getOrDefault(funcionario.getCargo().getCargoBase(), BigDecimal.ZERO);
//                      mapSalarios.put(funcionario.getCargo().getCargoBase(),
//                          salarioAtual.add(funcionario.getSalarioBruto()));
//                    }
//                );


  }

  // Mapa com o total de salários por cargo
  // Percorrer tudo, somar no mapa de resultado chave == cargo, valor += salario
  public Map<CargoBase, BigDecimal> returnMapCargoSalarioTotal(List<Funcionario> mapCargoFuncionarioList) {
    return mapCargoFuncionarioList.stream().collect(Collectors.groupingBy(funcionario -> funcionario.getCargo().getCargoBase(),
        Collectors.reducing(BigDecimal.ZERO, Funcionario::getSalarioBruto, BigDecimal::add)));
  }

  private BigDecimal getSalarioTotalBrutoOfList (List<Funcionario> funcionarioList) {
    return salarioService.getSalarioTotalBrutoOfList(funcionarioList);
  }

}
