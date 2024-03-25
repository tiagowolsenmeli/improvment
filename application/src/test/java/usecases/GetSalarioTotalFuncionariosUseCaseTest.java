package usecases;

import improvment.entities.cargos.Cargo;
import improvment.entities.enums.CargoBase;
import improvment.entities.funcionario.Funcionario;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import improvment.services.SalarioService;
import improvment.usecases.salario.GetSalarioTotalFuncionariosUseCase;

@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
public class GetSalarioTotalFuncionariosUseCaseTest {


  @InjectMocks
  private GetSalarioTotalFuncionariosUseCase target;

  @Mock
  private SalarioService salarioService;

  @Test
  public void getMapSalariosByCargoAll(){
    //given
    Map<String,BigDecimal> expected = Map.of(CargoBase.DEV_JUNIOR.name(), BigDecimal.valueOf(1100.00)
    ,CargoBase.DEV_PLENO.name(), BigDecimal.valueOf(4200.0));
    List<Funcionario> inputFuncionariosList = new ArrayList<>();
    List<Funcionario> mockList = new ArrayList<>();
    CargoBase cargoBase = CargoBase.DEV_JUNIOR;


    Cargo cargo = new Cargo();
    cargo.setCargoBase(CargoBase.DEV_JUNIOR);
    Funcionario funcionario1 = new Funcionario();
    funcionario1.setCargo(cargo);
    funcionario1.setSalario(BigDecimal.valueOf(1000.00));
    funcionario1.setAdicionalPersonalizado(BigDecimal.valueOf(100.00));

    Funcionario funcionario2 = new Funcionario();
    Cargo cargoDevPleno = new Cargo();
    cargoDevPleno.setCargoBase(CargoBase.DEV_PLENO);
    funcionario2.setCargo(cargoDevPleno);
    funcionario2.setSalario(BigDecimal.valueOf(2000.00));
    funcionario2.setAdicionalPersonalizado(BigDecimal.valueOf(100.00));

    Funcionario funcionario3 = new Funcionario();
    funcionario3.setCargo(cargoDevPleno);
    funcionario3.setSalario(BigDecimal.valueOf(2000.00));
    funcionario3.setAdicionalPersonalizado(BigDecimal.valueOf(100.00));


    inputFuncionariosList.add(funcionario1);
    inputFuncionariosList.add(funcionario2);
    inputFuncionariosList.add(funcionario3);
    mockList.add(funcionario1);

    //then
    Map<CargoBase, BigDecimal> result = target.execute(inputFuncionariosList);

    //when
    Assertions.assertEquals(equals(expected), equals(result));
  }
}
