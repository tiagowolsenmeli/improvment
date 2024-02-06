package pip1.usecase;

import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import plano_dev_individual.pip_pdi_p1.business.GetSalarioTotalOfFuncionariosPerCargoUseCase;
import plano_dev_individual.pip_pdi_p1.business.GetSalarioTotalOfListFuncionariosUseCase;
import plano_dev_individual.pip_pdi_p1.entities.Funcionario;
import plano_dev_individual.pip_pdi_p1.entities.cargos.Cargo;
import plano_dev_individual.pip_pdi_p1.enums.CargoBase;

@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
public class ListarSalariosPerCargoUseCase {


  @InjectMocks
  private GetSalarioTotalOfFuncionariosPerCargoUseCase target;


  @Mock
  GetSalarioTotalOfListFuncionariosUseCase getSalarioTotalOfListFuncionariosUseCase;

  @Test
  public void getFuncinariosAptosParaSalario(){
    //given
    BigDecimal expected = BigDecimal.valueOf(1100.00);
    List<Funcionario> inputFuncionariosList = new ArrayList<>();
    List<Funcionario> mockList = new ArrayList<>();

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

    when(getSalarioTotalOfListFuncionariosUseCase.execute(mockList))
        .thenReturn(BigDecimal.valueOf(1100.00));

    //then
    BigDecimal result = target.getSalarioTotalPerCargo(inputFuncionariosList, CargoBase.DEV_JUNIOR);


    //when
    Assertions.assertEquals(expected, result);
  }
}
