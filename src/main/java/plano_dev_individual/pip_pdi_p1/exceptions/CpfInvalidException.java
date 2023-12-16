package plano_dev_individual.pip_pdi_p1.exceptions;

public class CpfInvalidException extends BusinessException {
  public CpfInvalidException(final String message) {
    super(message);
  }

  public CpfInvalidException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
