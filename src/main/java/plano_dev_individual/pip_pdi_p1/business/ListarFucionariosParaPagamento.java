package plano_dev_individual.pip_pdi_p1.business;

import java.util.Set;
import lombok.Data;
import plano_dev_individual.pip_pdi_p1.entities.Funcionario;
import plano_dev_individual.pip_pdi_p1.repositories.EmpregadoRelacionalBD;

@Data
public class ListarFucionariosParaPagamento {
  EmpregadoRelacionalBD empregadoRelacionalBD;

    public Set<Funcionario> listarFuncionariosParaPagamento(){
    return empregadoRelacionalBD.getFuncionariosAtivos();

  }
}
