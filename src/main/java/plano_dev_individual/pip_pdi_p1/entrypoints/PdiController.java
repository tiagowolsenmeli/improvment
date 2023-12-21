package plano_dev_individual.pip_pdi_p1.entrypoints;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import plano_dev_individual.pip_pdi_p1.business.TreinamentosUseCase;

@RestController
public class PdiController {

  @Autowired
  private  TreinamentosUseCase treinamentosUseCase;


  @PostMapping(path = "pdi/treinamento",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<String>> createListTrainmentAndReturnOrdered(@RequestBody String listaTreinamento) {
    List<String> list = treinamentosUseCase.inputStringAndReturnOrderedList(listaTreinamento);

    return ResponseEntity.ok(list);
  }
}
