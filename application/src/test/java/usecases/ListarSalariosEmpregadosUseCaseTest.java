package usecases;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import improvment.entities.cargos.Cargo;
import improvment.entities.enums.CargoBase;
import improvment.entities.funcionario.Funcionario;
import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import improvment.services.SalarioService;
import improvment.usecases.salario.GetSalarioTotalOfListFuncionariosUseCase;


@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
public class ListarSalariosEmpregadosUseCaseTest {


  @InjectMocks
  private GetSalarioTotalOfListFuncionariosUseCase target;

  @Mock
  private SalarioService salarioService;



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

    when(salarioService.getSalarioTotalBrutoOfList(funcionarioList))
        .thenReturn(BigDecimal.valueOf(3200.00));

    BigDecimal result = target.execute(funcionarioList);


    Assertions.assertEquals(expected, result);
  }
}
