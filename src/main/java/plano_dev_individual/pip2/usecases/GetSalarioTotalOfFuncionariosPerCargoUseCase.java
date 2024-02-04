package plano_dev_individual.pip2.usecases;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Service;
import plano_dev_individual.pip2.entities.Funcionario;
import plano_dev_individual.pip2.entities.enums.CargoBase;



@Service
public class GetSalarioTotalOfFuncionariosPerCargoUseCase {

  GetSalarioTotalOfListFuncionariosUseCase getSalarioTotalOfListFuncionariosUseCase;
  public BigDecimal getSalarioTotalPerCargo(List<Funcionario> funcionarioList, CargoBase cargoBase) {
    Set<Funcionario> funcionariosUnicos = new HashSet<>(funcionarioList);

    List<Funcionario> funcionariosList = funcionariosUnicos.stream()
        .filter(funcionario -> funcionario.getCargo().getCargoBase().equals(cargoBase))
        .toList();

    return getSalarioTotalOfListFuncionariosUseCase.execute(funcionariosList);
  }
}
