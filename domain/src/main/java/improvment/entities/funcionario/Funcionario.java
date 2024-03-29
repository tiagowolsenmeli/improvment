package improvment.entities.funcionario;

import improvment.entities.cargos.Cargo;
import improvment.entities.cargos.Funcao;
import improvment.entities.pessoa.PessoaFisica;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Funcionario extends PessoaFisica {

    @ManyToOne
    private Cargo cargo;

    @ManyToOne
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
        if (adicionalPersonalizado != null && salario != null){
        return salario.add(adicionalPersonalizado);
    }
    return BigDecimal.ZERO;
    }
}
