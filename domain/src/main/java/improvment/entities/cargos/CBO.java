package improvment.entities.cargos;

public class CBO {
    private int id;
    private String nome;
    private String descricao;
    private String codigo;

    public CBO(int id, String nome, String descricao, String codigo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigo() {
        return codigo;
    }
}
