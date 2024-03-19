package improvment.entities.pessoa;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa {
  @Id
  private long id;

  public long getId() {
    return id;
  } //Herança

  public abstract long getExternalId();  //Polimorfismo

  public abstract String getName(); //Polimorfismo
}
