package plano_dev_individual.pip_pdi_p1.externalinterfaces.repository;

import java.util.Set;
import plano_dev_individual.pip_pdi_p1.entities.Funcionario;
import plano_dev_individual.pip_pdi_p1.repositories.EmpregadoRelacionalBD;

public class EmpregadoRelacionalRepository implements EmpregadoRelacionalBD {

  private Set<Funcionario> funcionariosAtivos;

  private Set<Funcionario> funcionariosInaptos;

    public EmpregadoRelacionalRepository() {
      Funcionario funcionario = new Funcionario();
      funcionario.setCpf("12345678901");
      Funcionario funcionario2 = new Funcionario();
      funcionario2.setCpf("12345678902");
        funcionariosAtivos.add(funcionario);
        funcionariosAtivos.add(funcionario2);
        funcionariosAtivos.add(funcionario2);

      Funcionario funcionario3 = new Funcionario();
      funcionario3.setCpf("12345678903");
      Funcionario funcionario4 = new Funcionario();
      funcionario4.setCpf("12345678904");
      funcionariosAtivos.add(funcionario3);
      funcionariosAtivos.add(funcionario4);
      funcionariosAtivos.add(funcionario3);

    }

  @Override
  public Set<Funcionario> getFuncionariosAptosParaSalario() {
    return funcionariosAtivos;
  }

  @Override
  public Set<Funcionario> getFuncionariosInaptosParaSalario() {
    return null;
  }
}
