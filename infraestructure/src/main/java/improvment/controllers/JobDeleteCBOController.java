package improvment.controllers;

import improvment.controllers.dto.JobDeleteErrorsInput;
import improvment.usecase.DeleteCBOUsecase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job/cbo")
@AllArgsConstructor
public class JobDeleteCBOController {


  private final DeleteCBOUsecase deleteCBOUsecase;


  @DeleteMapping
  public ResponseEntity<Integer> deleteCBOS(@RequestBody JobDeleteErrorsInput jobDeleteErrorsInput ){

    return ResponseEntity.ok(deleteCBOUsecase.execute(jobDeleteErrorsInput.getEndDateLocalDateTime(), jobDeleteErrorsInput.getLimit()));
  }
}
