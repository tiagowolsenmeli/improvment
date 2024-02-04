package plano_dev_individual.pip_pdi_p1.enums;

import lombok.Data;

public enum CargoBase {

  DEV_JUNIOR(3000.00),
  DEV_PLENO(5000.00),
  DEV_SENIOR(8000.00),
  LUIZ(10000.00);

  CargoBase(double value) {
  }
}
