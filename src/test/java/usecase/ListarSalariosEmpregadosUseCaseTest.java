package usecase;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doReturn;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import plano_dev_individual.pip_pdi_p1.business.GetSalarioTotalOfListFuncionariosUseCase;
import plano_dev_individual.pip_pdi_p1.entities.Funcionario;
import plano_dev_individual.pip_pdi_p1.entities.cargos.Cargo;
import plano_dev_individual.pip_pdi_p1.enums.CargoBase;

@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
public class ListarSalariosEmpregadosUseCaseTest {


  @InjectMocks
  private GetSalarioTotalOfListFuncionariosUseCase target;



  @Test
  public void getFuncinariosAptosParaSalario(){
    BigDecimal expected = BigDecimal.valueOf(3200.00);
    List<Funcionario> funcionarioList = new ArrayList<>();

    Cargo cargo = new Cargo();
    cargo.setCargoBase(CargoBase.valueOf(CargoBase.DEV_JUNIOR.name()));
    Funcionario funcionario1 = new Funcionario();
    funcionario1.setSalario(BigDecimal.valueOf(1000.00));
    funcionario1.setAdicionalPersonalizado(BigDecimal.valueOf(100.00));

    Funcionario funcionario2 = new Funcionario();
    funcionario2.setSalario(BigDecimal.valueOf(2000.00));
    funcionario2.setAdicionalPersonalizado(BigDecimal.valueOf(100.00));

    funcionarioList.add(funcionario1);
    funcionarioList.add(funcionario2);
    funcionarioList.add(funcionario2);

    BigDecimal result = target.execute(funcionarioList);


    Assertions.assertEquals(expected, result);
  }
}
