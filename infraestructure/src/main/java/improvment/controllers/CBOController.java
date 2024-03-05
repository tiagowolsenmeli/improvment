package improvment.controllers;

import improvment.entities.cargos.CBO;
import improvment.repositories.CBORepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CBO")
public class CBOController {

  @Autowired
  private CBORepository cboRepository;


  @GetMapping
  public ResponseEntity<Object> returnAllCBOs(){

    List<CBO> cboList = new ArrayList<CBO>();
    try {
      cboList = cboRepository.findAll();
      return ResponseEntity.ok(cboList);
    } catch (Exception e) {
      e.printStackTrace();
      return ResponseEntity.internalServerError().body(e.getMessage());
    }
  }
}
