package rafaros.backend.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rafaros.backend.entities.Utilisateur;

import java.util.List;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	
//  public Utilisateur findByLogin(String email);
  @Query(nativeQuery = true)
  public Utilisateur findUtilisateurByLoginAndPassword(@Param("login") String login, @Param("password") String password);

//SIGNATURES FROM ADDED ATTRIBUTES'S ENTITY : *********************
  @Query(nativeQuery = true)
  public List<Utilisateur> findUtilisateurByKeyWord(@Param("search") String search);

//  @Query(nativeQuery = true)
//  public List<Utilisateur> findUtilisateurByLoginAndPassword(@Param("email") String loginEmail, @Param("password") String password);
  public Utilisateur findUtilisateurByLogin(String login);

}
