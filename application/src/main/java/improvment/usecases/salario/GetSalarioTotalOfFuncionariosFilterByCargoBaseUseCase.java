package improvment.usecases.salario;

import improvment.entities.enums.CargoBase;
import improvment.entities.funcionario.Funcionario;
import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import improvment.services.SalarioService;


@Service
@NoArgsConstructor
public class GetSalarioTotalOfFuncionariosFilterByCargoBaseUseCase {

  @Autowired
  private SalarioService salarioService;
  public BigDecimal getSalarioTotalPerCargo(List<Funcionario> funcionarioList, CargoBase cargoBase) {
    return salarioService
        .getSalarioTotalBrutoFiltered(funcionarioList, filterByCargoBase(cargoBase));
  }

  private Predicate<Funcionario> filterByCargoBase(CargoBase cargoBase) {
    return funcionario -> cargoBase.equals(funcionario.getCargo().getCargoBase());
  }
}
