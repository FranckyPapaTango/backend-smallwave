package rafaros.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rafaros.backend.entities.Produit;
import rafaros.backend.services.ProduitService;

import java.util.List;






/**
 *
 * @author BigWave
 */
@RestController
//@CrossOrigin("http://localhost:4200") /*   alternative to: @CrossOrigin(origins = {"*"})  ?! */
@CrossOrigin("*")
@RequestMapping("/api/produit")
public class ProduitRestContoller {
  
  @Autowired
  private ProduitService produitService;
 
//  @Autowired
//	private TypecommandeService typecommandeService;
  
  /*
   * READ MANY TO ONE CHILDS
   */
	@GetMapping("/getallproduit")
	public ResponseEntity<List<Produit>> listeAllproduit() {
		return new ResponseEntity<>(produitService.findAll(), HttpStatus.OK);
	}

}
