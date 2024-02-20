package improvment.entities.enums;

public enum OrientacaoSexual {
    HETEROSSEXUAL("Heterossexual"),
    HOMOSSEXUAL("Homossexual"),
    BISEXUAL("Bissexual"),
    PANSEXUAL("Pansexual"),
    ASSEXUAL("Assexual"),
    OUTRO("Outro"),
    NAOFORNECIDO ("Não fornecido");

    private final String orientacaoSexual;

    OrientacaoSexual(final String orientacaoSexual) {
        this.orientacaoSexual = orientacaoSexual;
    }

    public String getOrientacaoSexual() {
        return orientacaoSexual;
    }
}
