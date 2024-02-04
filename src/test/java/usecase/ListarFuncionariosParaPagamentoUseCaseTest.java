package usecase;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doReturn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import plano_dev_individual.pip_pdi_p1.business.ListarFucionariosParaPagamentoUseCase;
import plano_dev_individual.pip_pdi_p1.entities.Funcionario;
import plano_dev_individual.pip_pdi_p1.repositories.EmpregadoRelacionalBD;

@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
public class ListarFuncionariosParaPagamentoUseCaseTest {


  @InjectMocks
  private ListarFucionariosParaPagamentoUseCase target;

  @Mock
  private EmpregadoRelacionalBD empregadoRelacionalBD;


  @Test
  public void getFuncinariosAptosParaSalario(){
    Set<Funcionario> expected = new HashSet<>();
    Set<Funcionario> empregadosAptos = new HashSet<>();
    Funcionario funcionario = new Funcionario();
    funcionario.setCpf("12345678901");
    empregadosAptos.add(funcionario);
    empregadosAptos.add(funcionario);
    empregadosAptos.add(funcionario);
    expected.add(funcionario);

    doReturn(empregadosAptos).when(empregadoRelacionalBD).getFuncionariosAptosParaSalario();
    Set<Funcionario> result = target.listarFuncionariosParaPagamento();

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void listarFuncionariosAfastados(){
    Map<String,Funcionario> expected = new HashMap<>();
    Map<String,Funcionario> empregadosAptos = new HashMap<>();
    Funcionario funcionario = new Funcionario();
    funcionario.setCpf("12345678902");
    funcionario.setMatricula("1");
    empregadosAptos.put(funcionario.getMatricula(),funcionario);
    expected.put(funcionario.getMatricula(),funcionario);

    doReturn(empregadosAptos).when(empregadoRelacionalBD).getFuncionariosInaptosParaSalario();
    Map<String, Funcionario> result = target.listarFuncionariosAfastados();

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void refilQueueFuncionariosToPay(){
    Queue<Funcionario> expected = new LinkedList<>();
    Set<Funcionario> empregadosAptos = new HashSet<>();
    Funcionario funcionario = new Funcionario();
    funcionario.setCpf("12345678901");
    empregadosAptos.add(funcionario);
    empregadosAptos.add(funcionario);
    empregadosAptos.add(funcionario);
    expected.add(funcionario);

    doReturn(empregadosAptos).when(empregadoRelacionalBD).getFuncionariosAptosParaSalario();
    Queue<Funcionario> result = target.refilQueueFuncionarios();

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void listarFuncionariosParaPagamento(){
    Set<Funcionario> empregadosAptos = new HashSet<>();
    Funcionario funcionario1 = new Funcionario();
    funcionario1.setCpf("12345678901");
    funcionario1.setMatricula("1");
    Funcionario funcionario2 = new Funcionario();
    funcionario2.setCpf("12345678902");
    funcionario2.setMatricula("2");
    empregadosAptos.add(funcionario1);
    empregadosAptos.add(funcionario1);
    empregadosAptos.add(funcionario1);
    empregadosAptos.add(funcionario2);

    doReturn(empregadosAptos).when(empregadoRelacionalBD).getFuncionariosAptosParaSalario();
    Queue<Funcionario> refilQueueFuncionarios = target.refilQueueFuncionarios();
    Funcionario result1 = target.nextFuncionarioToPay();
    Funcionario result2 = target.nextFuncionarioToPay();

    Assertions.assertEquals(funcionario1.getMatricula(), result1.getMatricula());
    Assertions.assertEquals(funcionario2.getMatricula(), result2.getMatricula());

    assertThrows(
        NoSuchElementException.class,
        () -> target.nextFuncionarioToPay(),
        "Espera-se que a lista esteja vazia após retirar todos os funcionários."
    );
  }
}
