package usecases;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import entities.cargos.Cargo;
import entities.enums.CargoBase;
import entities.funcionario.Funcionario;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import services.SalarioService;
import usecases.salario.GetSalarioTotalOfFuncionariosFilterByCargoBaseUseCase;

@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
public class GetSalarioTotalOfFuncionariosFilterByCargoBaseUseCaseTest {


  @InjectMocks
  private GetSalarioTotalOfFuncionariosFilterByCargoBaseUseCase target;

  @Mock
  private SalarioService salarioService;

  @Test
  public void getFuncinariosAptosParaSalario(){
    //given
    BigDecimal expected = BigDecimal.valueOf(1100.00);
    List<Funcionario> inputFuncionariosList = new ArrayList<>();
    List<Funcionario> mockList = new ArrayList<>();
    CargoBase cargoBase = CargoBase.DEV_JUNIOR;

    Predicate<Funcionario> filterByCargoBase = funcionario -> cargoBase.equals(funcionario.getCargo().getCargoBase());

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
    funcionario2.setSalario(BigDecimal.valueOf(2000.00));
    funcionario2.setAdicionalPersonalizado(BigDecimal.valueOf(100.00));


    inputFuncionariosList.add(funcionario1);
    inputFuncionariosList.add(funcionario2);
    inputFuncionariosList.add(funcionario3);
    mockList.add(funcionario1);

    when(salarioService.getSalarioTotalBrutoFiltered(eq(mockList), eq(filterByCargoBase)))
        .thenReturn(BigDecimal.valueOf(1100.00));

    //then
    BigDecimal result = target.getSalarioTotalPerCargo(inputFuncionariosList, CargoBase.DEV_JUNIOR);

    //when
    Assertions.assertEquals(expected, result);
  }
}
