package plano_dev_individual.pip2.entities.enums;

import java.math.BigDecimal;

public enum CargoBase {

  DEV_JUNIOR(BigDecimal.valueOf( 3000.00)),
  DEV_PLENO(BigDecimal.valueOf( 5000.00)),
  DEV_SENIOR(BigDecimal.valueOf( 8000.00)),
  LUIZ(BigDecimal.valueOf( 10000.00));

  final BigDecimal value;
  private CargoBase(BigDecimal value) {
    this.value = value;
  }
  private BigDecimal getValue() {
        return value;
    }
}
