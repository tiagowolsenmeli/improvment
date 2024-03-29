package improvment.entities.cargos;

import improvment.entities.enums.CargoBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Entity
public class Cargo {
  @Id
  private Long id;

  private BigDecimal salario;

    private CargoBase cargoBase;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "cbo_ID", referencedColumnName = "id")
    private CBO cbo;
    private boolean vinculoAtivo;


  public void setId(Long id) {
    this.id = id;
  }

  public Cargo(final BigDecimal salario, final String nome, final CBO cbo, final boolean vinculoAtivo,
                 final CargoBase cargoBase) {
        this.salario = salario;
        this.nome = nome;
        this.cbo = cbo;
        this.vinculoAtivo = vinculoAtivo;
        this.cargoBase = cargoBase;
    }

    public Cargo(){
    }

  public void setCargoBase(CargoBase cargoBase) {
    this.cargoBase = cargoBase;
  }

  public String getNome() {
    return nome;
  }

  private void setNome(final String nome) {
    this.nome = nome;
  }

  public BigDecimal getSalario() {
    return salario;
  }
  private void setSalario(final BigDecimal salario) {
    this.salario = salario;
  }

  private CBO getCBO() {
    return cbo;
  }

  private void setCBO(final CBO cbo) {
    this.cbo = cbo;
  }

  private boolean isVinculoAtivo() {
    return vinculoAtivo;
  }

  private void setVinculoAtivo(final boolean vinculoAtivo) {
      this.vinculoAtivo = vinculoAtivo;
  }

  public boolean devoPagarSalario() {
    return isVinculoAtivo();
  }

public boolean pagarSalario(final BigDecimal salario) {
    return isVinculoAtivo() && salario.compareTo(getSalario()) == 0;
  }
  
}
