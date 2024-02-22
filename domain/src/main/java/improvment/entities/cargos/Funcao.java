package improvment.entities.cargos;

import improvment.entities.enums.FuncaoBase;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class Funcao {
  private String funcao;

  private String insalubridade;

  private String periculosidade;

  private boolean gratificacao;

  private void setFuncaoBase(FuncaoBase funcaoBase){
    this.funcao = funcaoBase.name();
  }

  private void getFuncaoBase(FuncaoBase funcaoBase){
    this.funcao = funcaoBase.name();
  }

  public BigDecimal getPercentual() {
    return BigDecimal.valueOf(
        FuncaoBase.valueOf(funcao).getValue()
    );
  }
}
