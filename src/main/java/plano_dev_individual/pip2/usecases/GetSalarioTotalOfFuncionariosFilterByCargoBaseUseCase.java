package plano_dev_individual.pip2.usecases;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.stereotype.Service;
import plano_dev_individual.pip2.entities.Funcionario;
import plano_dev_individual.pip2.entities.enums.CargoBase;
import plano_dev_individual.pip2.services.SalarioService;


@Service
public class GetSalarioTotalOfFuncionariosFilterByCargoBaseUseCase {

  private  SalarioService salarioService;
  public BigDecimal getSalarioTotalPerCargo(List<Funcionario> funcionarioList, CargoBase cargoBase) {
    return salarioService
        .getSalarioTotalBrutoFiltered(funcionarioList, filterByCargoBase(cargoBase));
  }

  private Predicate<Funcionario> filterByCargoBase(CargoBase cargoBase) {
    return funcionario -> cargoBase.equals(funcionario.getCargo().getCargoBase());
  }
}
