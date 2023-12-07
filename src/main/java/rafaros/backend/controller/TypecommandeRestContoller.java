package rafaros.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rafaros.backend.entities.Typecommande;
import rafaros.backend.services.TypecommandeService;

import java.util.List;







/**
 *
 * @author BigWave
 */
@RestController
//@CrossOrigin("http://localhost:4200") 
@CrossOrigin("*") 
@RequestMapping("/api/typecommande")
public class TypecommandeRestContoller {
  
  @Autowired
  private TypecommandeService typecommandeService;
  
  /*
   * READ
   */
	@GetMapping("/getalltypecommande")
	public ResponseEntity<List<Typecommande>> listeAllTypecommande() {
//		return new ResponseEntity<List<Typecommande>>(typecommandeService.findAll(), HttpStatus.OK);
		return new ResponseEntity<>(typecommandeService.findAll(), HttpStatus.OK);
	}

}
