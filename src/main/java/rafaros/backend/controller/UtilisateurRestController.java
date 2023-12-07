package rafaros.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rafaros.backend.entities.Utilisateur;
import rafaros.backend.services.UtilisateurService;

import java.util.List;

@RestController
//@CrossOrigin("http://localhost:4200") 
@CrossOrigin("*") 
@RequestMapping("/api/utilisateur")
public class UtilisateurRestController {
	
	  @Autowired
	  private UtilisateurService utilisateurService;
	  
	  
	  
	  
	  /*
	   * READ MANY TO ONE CHILDS (absent ici)
	   */
	/*	@GetMapping("/getall_??")
		public ResponseEntity<List<_??>> listeAll_??() {
			return new ResponseEntity<>(type_??Service.findAll(), HttpStatus.OK);
		}
	*/  
	  
	  
	  
	  /*
	   * CREATE (PostMapping)
	   */
		@PostMapping("/createutilisateur")
		public ResponseEntity<Utilisateur> createUtilisateur(@RequestBody Utilisateur utilisateur) {
			return new ResponseEntity<>(utilisateurService.save(utilisateur), HttpStatus.CREATED);
		}
	  /*
	   * READ
	   */
		@GetMapping("/getallutilisateur")
		public ResponseEntity<List<Utilisateur>> listeAllUtilisateur() {
			return new ResponseEntity<>(utilisateurService.findAll(), HttpStatus.OK);
		}

		
	  @GetMapping("{id}")
	  public ResponseEntity<Utilisateur> obtenerUtilisateur(@PathVariable Long id) {
	      return new ResponseEntity<>(utilisateurService.findById(id), HttpStatus.OK);
	  }
	  

		/*
		 * UPDATE (PutMapping)
		 * il est possible d'internaliser le detail de la methode dans l'implementation du service
		 * au lieu de le definir dans le restcontroller (ici)
		 */		
		    @PutMapping("/updateutilisateur/{id}")
		    public ResponseEntity<Utilisateur> actualizarUtilisateur(@PathVariable Long id, @RequestBody Utilisateur utilisateur) {		    	
		    	return new ResponseEntity<Utilisateur>(utilisateurService.update(id, utilisateur),HttpStatus.CREATED);
		    }
		    
		    
		    
		    /*
			 * DELETE (DeleteMapping)
			 */
			@DeleteMapping("/deleteutilisateur/{id}")
			public ResponseEntity<?> deleteUtilisateur(@PathVariable Long id) {
				utilisateurService.delete(id);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			
			
			  /*
			   * SPECIAL READ USER WITH PASSWORD
			   */
				@GetMapping("/getuserwithloginandpassword")
				public ResponseEntity<Utilisateur> getuserwithloginandpassword(@RequestParam  String login, @RequestParam  String password) {
					return new ResponseEntity<>(utilisateurService.findUtilisateurByLoginAndPassword(login, password), HttpStatus.OK);
				}

}
