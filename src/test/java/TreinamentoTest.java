import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import plano_dev_individual.pip_pdi_p1.entities.charpessoas.conhecimento.Treinamento;

public class TreinamentoTest {


  @Test
  public void testOrdenaListaTreinamentos() {
    final ArrayList<String>  inputList = new ArrayList<>(Arrays.asList("Java", "C++", "Python", "C#"));
    final ArrayList<String>  expectedList = new ArrayList<>(Arrays.asList("C#", "C++", "Java", "Python"));


    final ArrayList<String> result = Treinamento.ordenaListaTreinamentos(inputList);

    Assertions.assertEquals(expectedList, result);
  }

  @Test
  public void testOrdenaListaTreinamentos2() {
    final ArrayList<String> inputList = new ArrayList<>(Arrays.asList("Java", "C++", "Python", "C#"));
    final ArrayList<String>  expected = new ArrayList<>(Arrays.asList("C#", "C++", "Java", "Python"));

    ArrayList<String> result = Treinamento.ordenaListaTreinamentos(inputList);

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testOrdenaListaTreinamentosCompareTo2() {
    final ArrayList<String> inputList = new ArrayList<>(Arrays.asList("Java", "C++", "Python", "C#"));
    final ArrayList<String>  expected = new ArrayList<>(Arrays.asList("C#", "C++", "Java", "Python"));

    ArrayList<String> result = Treinamento.ordenaCompateTo(inputList);

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testOrdenaListaTreinamentos3() {
    final ArrayList<String> inputList = new ArrayList<>(Arrays.asList("Java", "C++", "Python", "C#"));
    inputList.add("Claudio");
    inputList.add("Zaza");
    inputList.add("Rodrigo");
    inputList.add("Washington");
    inputList.add("Barbara");
    inputList.add("Ellen");
    inputList.add("Ângstron");
    inputList.add("Óstia");
    inputList.add("1234555");

    final ArrayList<String>  expected = new ArrayList<>(Arrays.asList("1234555", "Barbara", "C#", "C++", "Claudio", "Ellen",
        "Java", "Python", "Rodrigo", "Washington", "Zaza", "Ângstron", "Óstia"));

    ArrayList<String> result = Treinamento.ordenaListaTreinamentos(inputList);

    Assertions.assertEquals(expected, result);
  }

}
