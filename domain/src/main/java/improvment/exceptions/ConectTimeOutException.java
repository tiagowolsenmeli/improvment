package improvment.exceptions;


public class ConectTimeOutException extends BusinessException {
  private final static int ERROR_CODE = 10;
  private final static String BUSINESS_MESSAGE = "Tente novamente mais tarde";
  private final static String MESSAGE = "Falha na conexão com o banco de dados";

  private  String errorMessage;


  public ConectTimeOutException(String errorMessage) {
    super(MESSAGE, ERROR_CODE, BUSINESS_MESSAGE);
    this.errorMessage = errorMessage;
  }

}
