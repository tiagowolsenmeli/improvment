package improvment.usecases.salario;

import improvment.entities.funcionario.Funcionario;
import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import improvment.services.SalarioService;

@Service
@AllArgsConstructor
public class GetSalarioTotalOfListFuncionariosUseCase {

  private SalarioService salarioService;
  //TODO Código tem que ser mais poético e semântico
  public BigDecimal execute(List<Funcionario> funcionarioList) {
    return salarioService.getSalarioTotalBrutoOfList(funcionarioList);
  }
}
