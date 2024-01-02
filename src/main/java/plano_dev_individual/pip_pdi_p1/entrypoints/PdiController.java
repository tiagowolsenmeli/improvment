package plano_dev_individual.pip_pdi_p1.entrypoints;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import plano_dev_individual.pip_pdi_p1.business.CadastrarPessoaUseCase;
import plano_dev_individual.pip_pdi_p1.business.TreinamentosUseCase;
import plano_dev_individual.pip_pdi_p1.entities.pessoa.PessoaFisica;
import plano_dev_individual.pip_pdi_p1.exceptions.BusinessException;

@RestController
//@Slf4j
public class PdiController {

  @Autowired
  private  TreinamentosUseCase treinamentosUseCase;
  @Autowired
  CadastrarPessoaUseCase cadastrarPessoaUseCase;


  @PostMapping(path = "pdi/treinamento",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<String>> createListTrainmentAndReturnOrdered(@RequestBody String listaTreinamento) {
    List<String> list = treinamentosUseCase.inputStringAndReturnOrderedList(listaTreinamento);

    return ResponseEntity.ok(list);
  }

  @PostMapping(path = "pdi/cadastro/pessoafisica",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> createPessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
    PessoaFisica returnPessoaCadastrada;
    try {
       returnPessoaCadastrada = cadastrarPessoaUseCase.cadastrarPessoaFisica(pessoaFisica);
      return ResponseEntity.ok(returnPessoaCadastrada);
    } catch (BusinessException businessException){
//      log.error("Erro ao realizar solicitação de pessoa física");
      return ResponseEntity.badRequest().body(businessException.getMessage());
    } finally {
//        log.info("Solcitação de pessoa física realizado com sucesso");
    }

    //RunTime exceção que você não precisa tratar. Exception você precisa tratar, se jogar para cima ele precisa tratar.


  }
}
