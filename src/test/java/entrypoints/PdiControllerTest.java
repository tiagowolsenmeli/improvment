package entrypoints;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;
import plano_dev_individual.pip_pdi_p1.entities.charpessoas.conhecimento.Treinamento;
import plano_dev_individual.pip_pdi_p1.entrypoints.PdiController;


@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class PdiControllerTest {

  @InjectMocks
  private PdiController pdiController;

  @Mock
  private Treinamento treinamento;

  @Test
  public void cadastrarTreinamentoTest(){
    final Treinamento input = new Treinamento();
    ResponseEntity<List<String>> result = pdiController.ordenarListaTreinamento(input);

    Assertions.assertEquals(input, result.getBody());
  }
}
