package plano_dev_individual.pip_pdi_p1.entities;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import plano_dev_individual.pip_pdi_p1.entities.cargos.Cargo;
import plano_dev_individual.pip_pdi_p1.entities.cargos.Funcao;
import plano_dev_individual.pip_pdi_p1.entities.pessoa.PessoaFisica;

@Data
@EqualsAndHashCode(callSuper = true)
public class Funcionario extends PessoaFisica {

    private Cargo cargo;

    private Funcao funcao;
    private String matricula;

    private BigDecimal adicionalPersonalizado;

    private BigDecimal salario;

    //TODO mais um campo valor - Salario
    // Enquanto mentoria dado  uma lista de funcionarios saber algumas informações agrupadas por cargo.
    // Dado todos os funcionarios eu quero saber o total de salarios por cargo.
    //TODO Exemplo: Soma total por cargo e media por cargo. Lembrando que essa lista pode ter dados repetidos.

    //Cria um teste que é o desafio do fachetti teste.
    //Vai criando funcionarios
    //Cargo, soma e media
    //Cargo - Entra uma lista
    //Formas diretas e funcionais


    public BigDecimal getSalarioBruto() {
        return salario.add(adicionalPersonalizado);
    }
}
