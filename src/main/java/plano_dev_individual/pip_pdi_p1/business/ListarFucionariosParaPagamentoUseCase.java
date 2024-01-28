package plano_dev_individual.pip_pdi_p1.business;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plano_dev_individual.pip_pdi_p1.entities.Funcionario;
import plano_dev_individual.pip_pdi_p1.repositories.EmpregadoRelacionalBD;

@Data
@Service
public class ListarFucionariosParaPagamentoUseCase {

  @Autowired
  private EmpregadoRelacionalBD empregadoRelacionalBD;

  private Queue <Funcionario> funcionariosToPay;

    public Set<Funcionario> listarFuncionariosParaPagamento(){
    return empregadoRelacionalBD.getFuncionariosAptosParaSalario();
  }

  public Map<String,Funcionario> listarFuncionariosAfastados(){
    return empregadoRelacionalBD.getFuncionariosInaptosParaSalario();
  }

  public Queue <Funcionario> refilQueueFuncionarios(){
    funcionariosToPay = new LinkedList<>(empregadoRelacionalBD.getFuncionariosAptosParaSalario());
    return funcionariosToPay;
  }
  public Funcionario nextFuncionarioToPay(){
    return funcionariosToPay.remove();
  }
}
