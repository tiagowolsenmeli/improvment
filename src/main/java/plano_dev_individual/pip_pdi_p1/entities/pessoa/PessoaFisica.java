package plano_dev_individual.pip_pdi_p1.entities.pessoa;

import plano_dev_individual.pip_pdi_p1.entities.pessoa.sexualidade.Sexualidade;

public class PessoaFisica extends Pessoa {
  private long id;
  private String nome;
  private String sobrenome;
  private String cpf;
  private String rg;
  private String dataNascimento;
  private Sexualidade sexualidade;

    @Override
    public String getExternalId() {
        return cpf;
        }


    @Override
    public String getName() {
      return nome;
    }

    public String getDadosPessoaisResumidos() {
      return nome + "/n" + sobrenome + "/n" + cpf + "/n" + rg + "/n" + dataNascimento + "/n" + sexualidade.getGenero();
    }

    public String getDigitosVerificadoresCpf() {
      return cpf.substring(cpf.length() -2);
    }


  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }


}
