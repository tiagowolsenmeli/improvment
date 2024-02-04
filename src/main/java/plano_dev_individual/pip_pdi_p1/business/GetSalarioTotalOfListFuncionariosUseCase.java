package plano_dev_individual.pip_pdi_p1.business;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import plano_dev_individual.pip_pdi_p1.entities.Funcionario;
import plano_dev_individual.pip_pdi_p1.enums.CargoBase;

public class GetSalarioTotalOfListFuncionariosUseCase {

  //TODO Código tem que ser mais poético e semântico
  public BigDecimal execute(List<Funcionario> funcionarioList) {
    return getSalarioTotalBrutoFilteredByPredicate(funcionarioList, funcionario -> true);
  }


  public BigDecimal executeByCargoBase(List<Funcionario> funcionarioList, CargoBase cargoBase) {
    return getSalarioTotalBrutoFilteredByPredicate(funcionarioList, funcionario -> cargoBase.equals(funcionario.getCargo().getCargoBase()));
  } //Evitar nullPointers
  public Map<CargoBase,BigDecimal> executeByCargoBase(List<Funcionario> funcionarioList) {
    return null;
  }

  //Poderia estar num service
  private BigDecimal getSalarioTotalBrutoFilteredByPredicate(List<Funcionario> funcionarioList, Predicate<Funcionario> meuFiltro) {
    Set<Funcionario> funcionariosUnicos = new HashSet<>(funcionarioList);
    return funcionariosUnicos.stream()
        .filter(meuFiltro)
        .map(Funcionario::getSalarioBruto)
        .reduce(BigDecimal.ZERO, BigDecimal::add);
  }
}
