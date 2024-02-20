package improvment.services;

import improvment.entities.funcionario.Funcionario;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import org.springframework.stereotype.Service;

@Service
public class SalarioService {

  public BigDecimal getSalarioTotalBrutoFiltered(List<Funcionario> funcionarioList, Predicate<Funcionario> meuFiltro) {
    Set<Funcionario> funcionariosUnicos = new HashSet<>(funcionarioList);
    return funcionariosUnicos.stream()
        .filter(meuFiltro)
        .map(Funcionario::getSalarioBruto)
        .reduce(BigDecimal.ZERO, BigDecimal::add);
  }

  public BigDecimal getSalarioTotalBrutoOfList(List<Funcionario> funcionarioList) {
    Set<Funcionario> funcionariosUnicos = new HashSet<>(funcionarioList);
    return funcionariosUnicos.stream()
        .filter(funcionario -> true)
        .map(Funcionario::getSalarioBruto)
        .reduce(BigDecimal.ZERO, BigDecimal::add);
  }
}
