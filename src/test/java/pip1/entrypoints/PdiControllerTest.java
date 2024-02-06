package pip1.entrypoints;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.http.ResponseEntity;
import plano_dev_individual.pip_pdi_p1.business.TreinamentosUseCase;
import plano_dev_individual.pip_pdi_p1.entrypoints.PdiController;

@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
public class PdiControllerTest {

  @Mock
  private TreinamentosUseCase treinamentosUseCase;

  @InjectMocks
  private PdiController pdiController ;


  @Test
  public void cadastrarTreinamentoTest(){
    final String input = "A,C,B,D";
    final List<String> expected = List.of("A", "B", "C", "D");

    when(treinamentosUseCase.inputStringAndReturnOrderedList(input)).thenReturn(expected);
    ResponseEntity<List<String>> result = pdiController.createListTrainmentAndReturnOrdered(input);

    Assertions.assertEquals(expected, result.getBody());
  }
}
