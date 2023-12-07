package rafaros.backend.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import rafaros.backend.entities.Produit;

@Transactional
//@CrossOrigin("*")//<= autorise tout appel/requête distant: 
@CrossOrigin("http://localhost:4200")
//@RepositoryRestResource //<= ceci crée automatiquement les restfull web services
@Repository//<=pour les JpaRepsitory
public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
