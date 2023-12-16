package plano_dev_individual.pip_pdi_p1.business;

import java.util.ArrayList;
import java.util.List;
import plano_dev_individual.pip_pdi_p1.entities.charpessoas.conhecimento.Treinamento;

public class TreinamentosUseCase {

  private Treinamento treinamento;

  public TreinamentosUseCase(Treinamento treinamento) {
    this.treinamento = treinamento;
  }

  public List<String> inputStringAndReturnOrderedList(String listStringSepartedByComma){
      final ArrayList<String> listOfString = treinamento.createlist(listStringSepartedByComma);
      final List<String> orderList = treinamento.ordenaListaTreinamentos(listOfString);
      return orderList;
    }
}
