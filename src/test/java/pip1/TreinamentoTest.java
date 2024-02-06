package pip1;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import plano_dev_individual.pip_pdi_p1.entities.charpessoas.conhecimento.Treinamento;
import plano_dev_individual.pip_pdi_p1.exceptions.BusinessException;

public class TreinamentoTest {

    @InjectMocks
    private Treinamento treinamento;

    @BeforeEach
    public void setUp() {
        treinamento = new Treinamento();
    }

  @Test
  public void testOrdenaListaTreinamentos() {
    final List<String>  inputList = new ArrayList<>(Arrays.asList("Java", "C++", "Python", "C#"));
    final List<String>  expectedList = new ArrayList<>(Arrays.asList("C#", "C++", "Java", "Python"));


    final List<String> result = treinamento.ordenaListaTreinamentos(inputList);

    Assertions.assertEquals(expectedList, result);
  }

  @Test
  public void testOrdenaListaTreinamentos2() {
    final List<String> inputList = new ArrayList<>(Arrays.asList("Java", "C++", "Python", "C#"));
    final List<String>  expected = new ArrayList<>(Arrays.asList("C#", "C++", "Java", "Python"));

    List<String> result = treinamento.ordenaListaTreinamentos(inputList);

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testOrdenaListaTreinamentosCompareTo() {
    final List<String> inputList = new ArrayList<>(Arrays.asList("Java", "C++", "Python", "C#"));
    final List<String>  expected = new ArrayList<>(Arrays.asList("C#", "C++", "Java", "Python"));

    List<String> result = treinamento.sortCompareTo(inputList);

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testOrdenaListaTreinamentosCompareTo2() {
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

    List<String> result = treinamento.sortCompareTo(inputList);

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

    List<String> result = treinamento.ordenaListaTreinamentos(inputList);

    Assertions.assertEquals(expected, result);
  }


  @Test
  public void testCreateListOfString() {
    final String inputList = "Java,C++,Python,C#,A";
    final ArrayList<String>  expected = new ArrayList<>(Arrays.asList("Java", "C++", "Python", "C#","A"));

    List<String> result = treinamento.createlist(inputList);

    Assertions.assertEquals(expected, result);
  }

//  @Test(expected = BusinessException.class)
  public void testCreatePalavrasChave() throws BusinessException {
      final String inputList = "Java,C++,Python,C#,A,Não cabe mais palavras";
      final ArrayList<String>  expected = new ArrayList<>(Arrays.asList("Java", "C++", "Python", "C#","A"));

         treinamento.setPalavrasChave(inputList);
         List<String> result =  treinamento.getPalavrasChave();

         Assertions.assertEquals(expected, result);
  }

}
