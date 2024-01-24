package plano_dev_individual.pip_pdi_p1.business;

import java.util.Set;
import lombok.Data;
import org.springframework.stereotype.Service;
import plano_dev_individual.pip_pdi_p1.entities.Funcionario;
import plano_dev_individual.pip_pdi_p1.repositories.EmpregadoRelacionalBD;

@Data
@Service
public class ListarFucionariosParaPagamentoUseCase {
  private EmpregadoRelacionalBD empregadoRelacionalBD;

    public Set<Funcionario> listarFuncionariosParaPagamento(){
    return empregadoRelacionalBD.getFuncionariosAptosParaSalario();
  }

  public Set<Funcionario> listarFuncionariosAfastados(){
    return empregadoRelacionalBD.getFuncionariosInaptosParaSalario();
  }
}
