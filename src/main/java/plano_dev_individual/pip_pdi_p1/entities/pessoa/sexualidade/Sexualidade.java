package plano_dev_individual.pip_pdi_p1.entities.pessoa.sexualidade;

public class Sexualidade {

  private String autodeclarada;
  private Boolean sexoBiologico;

  private String genero;

  public void setSexoBiologico(final String sexoBiologico) {
    switch (sexoBiologico) {
      case "Masculino":
        this.sexoBiologico = true;
        break;
      case "Feminino":
        this.sexoBiologico = false;
        break;
      case "Outro":
        this.sexoBiologico = null;
    }
  }

  public void setGenero(final String genero) {
    this.setGenero(genero);
  }

  public String setSexoBiologico() {
    if (sexoBiologico) {
      return "Masculino";
    } else if (!sexoBiologico) {
      return "Feminino";
    }
    return "Outro";
  }

}