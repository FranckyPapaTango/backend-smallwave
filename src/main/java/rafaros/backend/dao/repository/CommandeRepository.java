/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaros.backend.dao.repository;

/**
 *
 * @author Rafaros
 */

/**
 *
 * @author BigWave
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import rafaros.backend.entities.Commande;


/**
 *
 * @author BigWave
 */
@Transactional
//@CrossOrigin("*")//<= autorise tout appel/requête distant: 
@CrossOrigin("http://localhost:4200")
//@RepositoryRestResource //<= ceci crée automatiquement les restfull web services
@Repository//<=pour les JpaRepsitory
public interface CommandeRepository extends JpaRepository<Commande, Long>{
	
	   // public List<Commande> findByIdTypecommande(Typecommande idTypecommande);
    
	   // est équivalent à :
//	    @Query("SELECT c FROM Commande c WHERE c.idTypecommande= :idTypecommande")
//	    public List<Commande> findByTypecommande(@Param("idTypecommande")Typecommande idTypecommande);
//    
}