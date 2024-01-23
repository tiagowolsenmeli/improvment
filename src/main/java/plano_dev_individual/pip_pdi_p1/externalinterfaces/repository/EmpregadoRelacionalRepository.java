package plano_dev_individual.pip_pdi_p1.externalinterfaces.repository;

import java.util.HashSet;
import java.util.Set;
import plano_dev_individual.pip_pdi_p1.entities.Funcionario;
import plano_dev_individual.pip_pdi_p1.repositories.EmpregadoRelacionalBD;

public class EmpregadoRelacionalRepository implements EmpregadoRelacionalBD {

  private Set<Funcionario> funcionarios;

    public EmpregadoRelacionalRepository() {
      Funcionario funcionario = new Funcionario();
      funcionario.setCpf("12345678901");
        funcionarios.add(funcionario);
    }

  @Override
  public Set<Funcionario> getFuncionariosAptosParaSalario() {
    return  funcionarios;
  }

  @Override
  public Set<Funcionario> getFuncionariosInaptosParaSalario() {
    return null;
  }
}
