package rafaros.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rafaros.backend.entities.Commande;
import rafaros.backend.entities.Typecommande;
import rafaros.backend.services.CommandeService;
import rafaros.backend.services.TypecommandeService;

import java.util.List;






/**
 *
 * @author BigWave
 */
@RestController
//@CrossOrigin("http://localhost:4200") /*   alternative to: @CrossOrigin(origins = {"*"})  ?! */
@CrossOrigin("*")
@RequestMapping("/api/commande")
public class CommandeRestContoller {
  
  @Autowired
  private CommandeService commandeService;
 
  @Autowired
	private TypecommandeService typecommandeService;
  
  /*
   * READ MANY TO ONE CHILDS
   */
	@GetMapping("/getalltypecommande")
	public ResponseEntity<List<Typecommande>> listeAllTypecommande() {
		return new ResponseEntity<>(typecommandeService.findAll(), HttpStatus.OK);
	}
  
  
  /*
   * CREATE (PostMapping)
   */
	@PostMapping("/createcommande")
	public ResponseEntity<Commande> createCommande(@RequestBody Commande commande) {
		return new ResponseEntity<>(commandeService.save(commande), HttpStatus.CREATED);
	}
  /*
   * READ
   */
	@GetMapping("/getallcommande")
	public ResponseEntity<List<Commande>> listeAllCommande() {
		return new ResponseEntity<>(commandeService.findAll(), HttpStatus.OK);
	}

	
  @GetMapping("{id}")
  public ResponseEntity<Commande> obtenerCommande(@PathVariable Long id) {
      return new ResponseEntity<>(commandeService.findById(id), HttpStatus.OK);
  }
  

	/*
	 * UPDATE (PutMapping)
	 */		
	    @PutMapping("/updatecommande/{id}")
	    public ResponseEntity<Commande> actualizarCommande(@PathVariable Long id, @RequestBody Commande commande) {
	        Commande commandeEncontrado = commandeService.findById(id);
	        
	        if (commandeEncontrado == null) {
	            return new ResponseEntity<Commande>(HttpStatus.NOT_FOUND);}
	        
		try {
			commandeEncontrado.setBudget(commande.getBudget());
			commandeEncontrado.setCivilite(commande.getCivilite());
			/*commandeEncontrado.setCssRawColorCode(commande.getCssRawColorCode());
			commandeEncontrado.setDatePersistence(commande.getDatePersistence());*/
			commandeEncontrado.setDeadline(commande.getDeadline());
			commandeEncontrado.setDescriptionProduit(commande.getDescriptionProduit());
			commandeEncontrado.setEmail(commande.getEmail());
			/*commandeEncontrado.setIdCommande(commande.getIdCommande());*/
			commandeEncontrado.setTypecommande(commande.getTypecommande());
			commandeEncontrado.setInstantMessenger(commande.getInstantMessenger());
			commandeEncontrado.setNom(commande.getNom());
			commandeEncontrado.setNomProduit(commande.getNomProduit());
			commandeEncontrado.setPathDle(commande.getPathDle());
			commandeEncontrado.setPays(commande.getPays());
			commandeEncontrado.setPhone(commande.getPhone());
			commandeEncontrado.setPrenom(commande.getPrenom());
			/*commandeEncontrado.setUpdatedVersionDate(commande.getUpdatedVersionDate());*/
			return new ResponseEntity<>(commandeService.save(commandeEncontrado), HttpStatus.CREATED);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	/*
	 * DELETE (DeleteMapping)
	 */
	@DeleteMapping("/deletecommande/{id}")
	public ResponseEntity<?> deleteCommande(@PathVariable Long id) {
		commandeService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}