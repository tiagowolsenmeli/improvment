package plano_dev_individual.pip_pdi_p1.exceptions;

public class BusinessException extends Exception{
    private static final String errorMessage = "Erro de negócio: ";
    private String errorCode;
    private String businessMessage;

    public BusinessException(String message) {
     super(message);
      }

  public BusinessException(String message, String errorCode, String businessMessage) {
    this(message);
    this.errorCode = errorCode;
    this.businessMessage = businessMessage;
  }

  public BusinessException(String message, Throwable cause) {
    super(message, cause);
  }
}
