package usecases;

import entities.funcionario.Funcionario;
import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import services.SalarioService;

@Service
@AllArgsConstructor
public class GetSalarioTotalOfListFuncionariosUseCase {

  private SalarioService salarioService;
  //TODO Código tem que ser mais poético e semântico
  public BigDecimal execute(List<Funcionario> funcionarioList) {
    return salarioService.getSalarioTotalBrutoFiltered(funcionarioList, funcionario -> true);
  }
}
