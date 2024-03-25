package improvment.entities.pessoa;

import improvment.entities.pessoa.sexualidade.Sexualidade;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class PessoaFisica extends Pessoa {
  private long id;
  private String nome;
  private String sobrenome;
  private String cpf;

  private int digitoVerificador;
  private String rg;
  private String dataNascimento;
  @ManyToOne
  @JoinColumn(name = "sexualidade_ID")
  private Sexualidade sexualidade;

    @Override
    public long getId() {
      return id;
    }


    @Override
    public long getExternalId() {
      return Long.parseLong(cpf);
    }

    @Override
    public String getName() {
      return nome;
    }

    public String getDadosPessoaisResumidos() {
      return nome + "/n" + sobrenome + "/n" + cpf + "/n" + rg + "/n" + dataNascimento + "/n" + sexualidade.getGenero();
    }

    public String getDigitosVerificadoresCpf() {
      String cpfString = String.valueOf(cpf);
      return cpfString.substring(cpfString.length() -2);
    }


  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }


}
