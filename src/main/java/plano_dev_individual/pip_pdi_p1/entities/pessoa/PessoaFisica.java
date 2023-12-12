package plano_dev_individual.pip_pdi_p1.entities.pessoa;

import plano_dev_individual.pip_pdi_p1.entities.pessoa.sexualidade.Sexualidade;

public class PessoaFisica extends Pessoa {
  private long id;
  private String nome;
  private String sobrenome;
  private long cpf;
  private String rg;
  private String dataNascimento;
  private Sexualidade sexo;

    @Override
    public long getExternalId() {
      return cpf;
    }

    @Override
    public String getName() {
      return nome;
    }

    public String getDadosPessoaisResumidos() {
      return nome + "/n" + sobrenome + "/n" + cpf + "/n" + rg + "/n" + dataNascimento + "/n" + sexo;
    }

}
