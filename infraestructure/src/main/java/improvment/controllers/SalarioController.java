package improvment.controllers;


import improvment.entities.enums.CargoBase;
import improvment.entities.funcionario.Funcionario;
import improvment.exceptions.ConectTimeOutException;
import improvment.repositories.GetFuncionarioRepository;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import improvment.usecases.salario.GetSalarioTotalFuncionariosUseCase;

@RestController
public class SalarioController {

  @Autowired
  private  GetSalarioTotalFuncionariosUseCase getSalarioTotalFuncionariosUseCase;

  @Autowired
  private GetFuncionarioRepository getFuncionarioRepository;


  @GetMapping("/salario/all")
  public Map<CargoBase, BigDecimal> returnAllSalarios( ){
    List<Funcionario> funcionarioList;
    try {
      funcionarioList = getFuncionarioRepository.getFuncionarios();
        if (funcionarioList == null || funcionarioList.isEmpty()) {
            throw new ConectTimeOutException("Erro ao buscar funcionários");
        }
      return getSalarioTotalFuncionariosUseCase.execute(funcionarioList);
    } catch (ConectTimeOutException e) {
      throw new RuntimeException(e);
    }

  }

  @GetMapping("/salario/all/h2")
  public Map<CargoBase, BigDecimal> returnAllSalariosH2( ){
    List<Funcionario> funcionarioList;
    try {
      funcionarioList = getFuncionarioRepository.getFuncionariosH2();
      if (funcionarioList == null || funcionarioList.isEmpty()) {
        throw new ConectTimeOutException("Erro ao buscar funcionários");
      }
      return getSalarioTotalFuncionariosUseCase.execute(funcionarioList);
    } catch (ConectTimeOutException e) {
      throw new RuntimeException(e);
    }

  }
}
