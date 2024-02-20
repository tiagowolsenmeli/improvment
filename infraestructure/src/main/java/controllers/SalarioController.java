package controllers;


import entities.funcionario.Funcionario;
import exceptions.ConectTimeOutException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repositories.implementation.GetFuncionarioRepository;
import usecases.GetSalarioTotalFuncionariosUseCase;

@RestController
public class SalarioController {

  @Autowired
  private  GetSalarioTotalFuncionariosUseCase getSalarioTotalFuncionariosUseCase;

  @Autowired
  private GetFuncionarioRepository getFuncionarioRepository;


  @GetMapping("/salario/all")
  public Map<String, BigDecimal> returnAllSalarios( ){
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
}
