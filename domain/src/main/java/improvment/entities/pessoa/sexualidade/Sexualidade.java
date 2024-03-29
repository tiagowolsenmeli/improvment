package improvment.entities.pessoa.sexualidade;

import improvment.entities.enums.OrientacaoSexual;
import improvment.entities.enums.SexoBiologico;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Sexualidade {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id", nullable = false)
  private Long id;

  private SexoBiologico sexoBiologico;

  private String genero;

  private OrientacaoSexual orientacaoSexual;

  public void setSexoBiologico(final String sexoBiologico) {
    switch (sexoBiologico) {
      case "Masculino":
        this.sexoBiologico = SexoBiologico.MASCULINO;
        break;
      case "Feminino":
        this.sexoBiologico = SexoBiologico.FEMININO;
        break;
      case "Outro":
        this.sexoBiologico = SexoBiologico.OUTRO;
        break;
      default:
        if (sexoBiologico == null) {
          this.sexoBiologico = SexoBiologico.NAODECLARADO;
        }else {
          this.sexoBiologico = SexoBiologico.OUTRO;
        }
    }
  }

  public void setGenero(final String genero) {
    this.setGenero(genero);
  }

  public String getGenero() {
    return genero;
  }

  public void setOrientacaoSexual(final String orientacaoSexual) {
    final String orientacaoSexualLowerCase = orientacaoSexual.toLowerCase();

    switch (orientacaoSexualLowerCase) {
      case "heterossexual":
        this.orientacaoSexual = OrientacaoSexual.HETEROSSEXUAL;
        break;
      case "homossexual":
        this.orientacaoSexual = OrientacaoSexual.HOMOSSEXUAL;
        break;
      case "bissexual":
        this.orientacaoSexual = OrientacaoSexual.BISEXUAL;
        break;
      case "pansexual":
        this.orientacaoSexual = OrientacaoSexual.PANSEXUAL;
        break;
      case "assexual":
        this.orientacaoSexual = OrientacaoSexual.ASSEXUAL;
        break;
      default:
        if (orientacaoSexual == null) {
          this.orientacaoSexual = OrientacaoSexual.NAOFORNECIDO;
        }else {
          this.orientacaoSexual = OrientacaoSexual.OUTRO;
        }
    }
  }

  public String getOrientacaoSexual() {
    return orientacaoSexual.getOrientacaoSexual();
  }

  public String getSexoBiologico() {
    return sexoBiologico.getSexoBiologico();
  }


}