package improvment.controllers;

import improvment.entities.enums.CargoBase;
import improvment.entities.funcionario.Funcionario;
import improvment.exceptions.ConectTimeOutException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import improvment.usecases.salario.GetSalarioTotalOfFuncionariosFilterByCargoBaseUseCase;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

  @Autowired
  private GetSalarioTotalOfFuncionariosFilterByCargoBaseUseCase getSalarioTotalOfFuncionariosFilterByCargoBaseUseCase;

  @GetMapping("/salario/total")
  public ResponseEntity<Object> returnAllSalarios(

      @RequestParam(value = "cargoBase", required = true ) String cargoBase){

    List<Funcionario> funcionarioList = new ArrayList<Funcionario>(); //Buscar no banco
    CargoBase cargoBaseEnum = CargoBase.valueOf(cargoBase.toUpperCase());
    try {
      BigDecimal salarioTotalPerCargo =
          getSalarioTotalOfFuncionariosFilterByCargoBaseUseCase.getSalarioTotalPerCargo(funcionarioList, cargoBaseEnum);
      if (funcionarioList == null || funcionarioList.isEmpty()) {
        throw new ConectTimeOutException("Erro ao buscar funcionários");
      }
      return ResponseEntity.ok(salarioTotalPerCargo);
    } catch (ConectTimeOutException e) {
      return ResponseEntity.internalServerError().body(e.getMessage());
    }

  }
}
