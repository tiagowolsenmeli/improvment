package usecase;



import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import plano_dev_individual.pip_pdi_p1.business.TreinamentosUseCase;
import plano_dev_individual.pip_pdi_p1.entities.charpessoas.conhecimento.Treinamento;

@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
public class TreinamentosUseCaseTest {

  @InjectMocks
  private TreinamentosUseCase treinamentosUseCase;

  @Mock
  private Treinamento treinamento;


  @Test
  public void testTreinamentoUseCase(){
    List<String> listMock = List.of("D", "A", "B", "C");
    String input = "D,A,B,C";
    List<String> expected = List.of("A", "B", "C", "D");
    when(treinamento.createlist(input)).thenReturn(listMock);
    when(treinamento.ordenaListaTreinamentos(listMock)).thenReturn(expected);


    List<String> result = treinamentosUseCase.inputStringAndReturnOrderedList(input);

    Assertions.assertEquals(expected, result);
  }
}
