package improvment.entities.funcionario;

import improvment.entities.cargos.Cargo;
import improvment.entities.cargos.Funcao;
import improvment.entities.pessoa.PessoaFisica;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "TesteJPA")
public class TesteJPA extends PessoaFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
