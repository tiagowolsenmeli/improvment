package improvment.exceptions;

public class BusinessException extends Exception{
    private int errorCode;
    private String businessMessage;

    public BusinessException(String message) {
     super(message);
      }

  public BusinessException(String message, int errorCode, String businessMessage) {
    this(message);
    this.errorCode = errorCode;
    this.businessMessage = businessMessage;
  }

  public BusinessException(String message, Throwable cause) {
    super(message, cause);
  }

  public int getErrorCode() {
    return errorCode;
  }

  public String getBusinessMessage() {
    return businessMessage;
  }
}
