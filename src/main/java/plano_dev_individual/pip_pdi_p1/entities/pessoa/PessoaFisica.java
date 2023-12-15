package plano_dev_individual.pip_pdi_p1.entities.pessoa;

import plano_dev_individual.pip_pdi_p1.entities.pessoa.sexualidade.Sexualidade;

<<<<<<< HEAD
public class PessoaFisica extends Pessoa {
=======
public class PessoaFisica implements Pessoa {
>>>>>>> a0b91a8 (add pip_pdi_p1)
  private long id;
  private String nome;
  private String sobrenome;
  private long cpf;
  private String rg;
  private String dataNascimento;
  private Sexualidade sexo;

    @Override
<<<<<<< HEAD
=======
    public long getId() {
      return id;
    }

    @Override
>>>>>>> a0b91a8 (add pip_pdi_p1)
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
