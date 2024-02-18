package plano_dev_individual.pip2.usecases;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import plano_dev_individual.pip2.entities.Funcionario;
import plano_dev_individual.pip2.entities.enums.CargoBase;
import plano_dev_individual.pip2.services.SalarioService;

@Service
@AllArgsConstructor
public class GetSalarioTotalOfListFuncionariosUseCase {

  private SalarioService salarioService;
  //TODO Código tem que ser mais poético e semântico
  public BigDecimal execute(List<Funcionario> funcionarioList) {
    return salarioService.getSalarioTotalBrutoFiltered(funcionarioList, funcionario -> true);
  }
}
