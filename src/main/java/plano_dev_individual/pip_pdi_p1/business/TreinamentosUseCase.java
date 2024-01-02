package plano_dev_individual.pip_pdi_p1.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plano_dev_individual.pip_pdi_p1.entities.charpessoas.conhecimento.Treinamento;

@Service
public class TreinamentosUseCase {


  @Autowired
  private Treinamento treinamento;

  public List<String> inputStringAndReturnOrderedList(String listStringSepartedByComma){
      final List<String> listOfString = treinamento.createlist(listStringSepartedByComma);
      final List<String> orderList = treinamento.ordenaListaTreinamentos(listOfString);
      return orderList;
    }
}
