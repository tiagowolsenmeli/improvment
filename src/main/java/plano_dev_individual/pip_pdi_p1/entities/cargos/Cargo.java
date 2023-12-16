package plano_dev_individual.pip_pdi_p1.entities.cargos;

import java.math.BigDecimal;

public class Cargo {
  private BigDecimal salario;
    private String nome;
    private CBO cbo;
    private boolean vinculoAtivo;

    public Cargo(final BigDecimal salario, final String nome, final CBO cbo, final boolean vinculoAtivo) {
        this.salario = salario;
        this.nome = nome;
        this.cbo = cbo;
        this.vinculoAtivo = vinculoAtivo;
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
