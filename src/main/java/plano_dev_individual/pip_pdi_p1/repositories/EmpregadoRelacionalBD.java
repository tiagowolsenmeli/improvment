package plano_dev_individual.pip_pdi_p1.repositories;

import java.util.Set;
import plano_dev_individual.pip_pdi_p1.entities.Funcionario;

public interface EmpregadoRelacionalBD {

  public Set<Funcionario> getFuncionariosAptosParaSalario();

  public Set<Funcionario> getFuncionariosInaptosParaSalario();

  }