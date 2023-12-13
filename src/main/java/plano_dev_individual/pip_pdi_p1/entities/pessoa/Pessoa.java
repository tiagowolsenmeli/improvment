package plano_dev_individual.pip_pdi_p1.entities.pessoa;

public abstract class Pessoa {
  private long id;

  public long getId() {
    return id;
  }
  public abstract String getExternalId();
  public abstract String getName();
}
