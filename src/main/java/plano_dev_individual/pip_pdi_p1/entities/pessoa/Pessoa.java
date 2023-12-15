package plano_dev_individual.pip_pdi_p1.entities.pessoa;

<<<<<<< HEAD
public abstract class Pessoa {
  private long id;

  public long getId() {
    return id;
  } //Herança
  public abstract long getExternalId();  //Polimorfismo
  public abstract String getName(); //Polimorfismo
=======
public interface Pessoa {
  public long getId();
  public long getExternalId();
  public String getName();
>>>>>>> a0b91a8 (add pip_pdi_p1)
}
