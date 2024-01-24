package usecase;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.mock.mockito.SpyBean;
import plano_dev_individual.pip_pdi_p1.business.ListarFucionariosParaPagamentoUseCase;
import plano_dev_individual.pip_pdi_p1.entities.Funcionario;
import plano_dev_individual.pip_pdi_p1.repositories.EmpregadoRelacionalBD;

@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
public class ListarFuncionariosParaPagamentoUseCaseTest {

  @InjectMocks
  private ListarFucionariosParaPagamentoUseCase target;

  @SpyBean
  private EmpregadoRelacionalBD empregadoRelacionalBD;



  @Test
  public void testTreinamentoUseCase(){
    Set<Funcionario> expected = new HashSet<>();
    Set<Funcionario> result = target.listarFuncionariosParaPagamento();

    Assertions.assertEquals(expected, result);
  }
}
