package plano_dev_individual.pip_pdi_p1.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import plano_dev_individual.pip_pdi_p1.entities.cargos.Cargo;
import plano_dev_individual.pip_pdi_p1.entities.pessoa.PessoaFisica;

@Data
@EqualsAndHashCode(callSuper = true)
public class Funcionario extends PessoaFisica {

    private Cargo cargo;
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public String setMatricula(String matricula) {
        return this.matricula = matricula;
    }
}
