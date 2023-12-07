/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaros.backend.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import rafaros.backend.entities.Actualite;
import rafaros.backend.entities.Categorie;

import java.util.List;


/**
 *
 * @author BigWave
 */
@Transactional
//@CrossOrigin("*")//<= autorise tout appel/requête distant: 
@CrossOrigin("http://localhost:4200")          
//@RepositoryRestResource      
@Repository 
public interface ActualiteRepository extends JpaRepository<Actualite, Long>{
    
    List<Actualite> findByIdCategorie(Categorie idCategorie);
    
}
