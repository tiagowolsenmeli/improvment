package entrypoints;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;
import plano_dev_individual.pip_pdi_p1.business.TreinamentosUseCase;
import plano_dev_individual.pip_pdi_p1.entities.charpessoas.conhecimento.Treinamento;
import plano_dev_individual.pip_pdi_p1.entrypoints.PdiController;


public class PdiControllerTest {

  @Mock
  private TreinamentosUseCase treinamentosUseCase;

  @InjectMocks
  private PdiController pdiController ;

  @BeforeEach
  public void setUp() {
    this.treinamentosUseCase = new TreinamentosUseCase(new Treinamento());
    this.pdiController = new PdiController(treinamentosUseCase);
  }


  @Test
  public void cadastrarTreinamentoTest(){
    final String input = "A,C,B,D";
    final List<String> expected = List.of("A", "B", "C", "D");

    ResponseEntity<List<String>> result = pdiController.createListTrainmentAndReturnOrdered(input);

    Assertions.assertEquals(expected, result.getBody());
  }
}
