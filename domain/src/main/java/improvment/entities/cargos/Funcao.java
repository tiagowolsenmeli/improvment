package improvment.entities.cargos;

import improvment.entities.enums.FuncaoBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Entity
public class Funcao {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  private String funcao;

  private String insalubridade;

  private String periculosidade;

  private boolean gratificacao;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

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
