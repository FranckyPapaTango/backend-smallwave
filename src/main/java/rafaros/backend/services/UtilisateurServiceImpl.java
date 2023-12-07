package rafaros.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafaros.backend.dao.repository.UtilisateurRepository;
import rafaros.backend.entities.Utilisateur;

import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{
	
	
	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	

	@Override
	public Utilisateur save(Utilisateur Utilisateur) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(Utilisateur);
	}

	@Override
	public Utilisateur findById(Long id) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findById(id).orElse(null);
	}

	@Override
	public List<Utilisateur> findAll() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur update(Long id,Utilisateur utilisateur) {

	        Utilisateur utilisateurEncontrado = utilisateurRepository.getOne(id);
	        
	        if (utilisateurEncontrado == null) {
	          //  return new ResponseEntity<Utilisateur>(HttpStatus.NOT_FOUND);
	        	return null;
	            }
	        
		try {
//			utilisateurEncontrado.setCodePostale(utilisateur.getCodePostale());
//			utilisateurEncontrado.setComplement(utilisateur.getComplement());
			utilisateurEncontrado.setCssRawColorCode(utilisateur.getCssRawColorCode());
			/*utilisateurEncontrado.setDatePersistence(utilisateur.getDatePersistence());*/
			utilisateurEncontrado.setLogin(utilisateur.getLogin());
			utilisateurEncontrado.setNom(utilisateur.getNom());
//			utilisateurEncontrado.setNumVoieTypeVoieLibelleVoie(utilisateur.getNumVoieTypeVoieLibelleVoie());
			/*utilisateurEncontrado.setIdUtilisateur(utilisateur.getIdUtilisateur());*/
			utilisateurEncontrado.setPassword(utilisateur.getPassword());
//			utilisateurEncontrado.setPathDle(utilisateur.getPathDle());
//			utilisateurEncontrado.setPays(utilisateur.getPays());		
			utilisateurEncontrado.setStatut(utilisateur.getStatut());
//			utilisateurEncontrado.setTelFixe(utilisateur.getTelFixe());
//			utilisateurEncontrado.setTelMobile(utilisateur.getTelMobile());
			utilisateurEncontrado.setUsername(utilisateur.getUsername());
//			utilisateurEncontrado.setVille(utilisateur.getVille());
			/*utilisateurEncontrado.setUpdatedVersionDate(this.utilisateur.getUpdatedVersionDate());*/
			//return new ResponseEntity<>(utilisateurService.save(utilisateurEncontrado), HttpStatus.CREATED);
			
//			utilisateurEncontrado.setSessionId(utilisateur.getSessionId());
			return utilisateurRepository.save(utilisateurEncontrado);
		}
		catch (Exception e){
			//return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		utilisateurRepository.deleteById(id);
		
	}

	@Override
	public Utilisateur findUtilisateurByLoginAndPassword(String login, String password) {
		return utilisateurRepository.findUtilisateurByLoginAndPassword(login, password);
	}

}
