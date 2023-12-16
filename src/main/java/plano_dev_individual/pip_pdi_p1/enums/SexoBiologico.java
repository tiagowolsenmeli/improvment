package plano_dev_individual.pip_pdi_p1.enums;

public enum SexoBiologico {
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    OUTRO("Outro"),
    NAODECLARADO("Não declarado");

    private final String sexoBiologico;

    SexoBiologico(final String sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }

    public String getSexoBiologico() {
        return sexoBiologico;
    }
}
