package plano_dev_individual.pip2.usecases;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import plano_dev_individual.pip2.entities.Funcionario;
import plano_dev_individual.pip2.entities.enums.CargoBase;
import plano_dev_individual.pip2.services.SalarioService;


@Service
public class GetSalarioTotalFuncionariosUseCase {

  private SalarioService salarioService;

  //TODO Código tem que ser mais poético e semântico
  public BigDecimal execute(List<Funcionario> funcionarioList) {
    return salarioService.getSalarioTotalBrutoFiltered(funcionarioList, funcionario -> true);
  }


  public BigDecimal executeByCargoBase(List<Funcionario> funcionarioList, CargoBase cargoBase) {
    return salarioService
        .getSalarioTotalBrutoFiltered(funcionarioList,
        funcionario -> cargoBase.equals(funcionario.getCargo().getCargoBase()));
  } //Evitar nullPointers

  public Map<CargoBase,BigDecimal> executeByCargoBase(List<Funcionario> funcionarioList) {
    return null;
  }

}
