package plano_dev_individual.pip_pdi_p1.exceptions;


import java.util.List;
import java.util.Set;

public class CpfInvalidException extends BusinessException {
  private final static int ERROR_CODE = 10;
  private final static String BUSINESS_MESSAGE = "CPF inválido";
  private final static String MESSAGE = "CPF não confere com o dígito verificador";
  private String cpf;


  public CpfInvalidException(final String cpf) {
    super(MESSAGE, ERROR_CODE, BUSINESS_MESSAGE);
    this.cpf = cpf;
  }

    public String getCpf() {
      return cpf;
    }
    Set<String> set;

}
