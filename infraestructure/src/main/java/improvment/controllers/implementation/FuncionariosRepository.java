package improvment.controllers.implementation;

import improvment.entities.cargos.Cargo;
import improvment.entities.enums.CargoBase;
import improvment.entities.funcionario.Funcionario;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionariosRepository implements GetFuncionarioRepository{

  private List<Funcionario> funcionarioList =  new ArrayList<>();


  public FuncionariosRepository(){
    Funcionario funcionario = new Funcionario();
    Cargo cargo = new Cargo();
    cargo.setCargoBase(CargoBase.DEV_JUNIOR);
    funcionario.setCargo(cargo);
    funcionario.setSalario(BigDecimal.valueOf(1000.00));
    funcionario.setAdicionalPersonalizado(BigDecimal.valueOf(100.00));

    Funcionario funcionario2 = new Funcionario();
    Cargo cargo2 = new Cargo();
    cargo2.setCargoBase(CargoBase.DEV_PLENO);
    funcionario2.setCargo(cargo2);
    funcionario2.setSalario(BigDecimal.valueOf(2000.00));
    funcionario2.setAdicionalPersonalizado(BigDecimal.valueOf(200.00));


    funcionarioList.add(funcionario);
    funcionarioList.add(funcionario2);
  }


  @Override
  public List<Funcionario> getFuncionarios() {
     return funcionarioList;
  }
}
