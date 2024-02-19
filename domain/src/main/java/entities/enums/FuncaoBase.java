package entities.enums;

import lombok.Getter;

@Getter
public enum FuncaoBase {
    LAYER_I(10),
    LAYER_II(20),
    LAYER_III(30),
    LAYER_IV(40),
    LAYER_V(50),
    LAYER_VI(60),
    LAYER_VII(70),
    LAYER_VIII(80),
    LAYER_IX(90),
    LAYER_X(100);

  private int value;

  FuncaoBase(final int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

}
