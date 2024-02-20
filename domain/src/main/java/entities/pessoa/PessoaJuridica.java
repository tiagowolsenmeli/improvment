package entities.pessoa;

public class PessoaJuridica {
  private long id;
  private String nomeFantasia;
  private String razaoSocial;
  private long cnpj;
  private String inscricaoEstadual;

    public long getId() {
        return id;
    }
    public long getExternalId() {
        return cnpj;
    }
    public String getName() {
        return nomeFantasia;
    }
    public String getInternalName() {
        return razaoSocial;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
    private String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

  private String setInscricaoEstadual() {
    return inscricaoEstadual;
  }
}
