package improvment.repositories;

import improvment.entities.funcionario.Funcionario;
import java.util.List;

public interface GetFuncionarioRepository {

  List<Funcionario> getFuncionarios();

  List<Funcionario> getFuncionariosH2();
}
