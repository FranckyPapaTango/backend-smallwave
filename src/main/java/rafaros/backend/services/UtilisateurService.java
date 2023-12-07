package rafaros.backend.services;

import rafaros.backend.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {
	
	public Utilisateur save (Utilisateur Utilisateur);
	public Utilisateur findById(Long id);
	public List<Utilisateur> findAll();
	public Utilisateur update(Long id,Utilisateur Utilisateur);
	public void delete(Long id);
	
	public Utilisateur findUtilisateurByLoginAndPassword(String login,String password);

}
