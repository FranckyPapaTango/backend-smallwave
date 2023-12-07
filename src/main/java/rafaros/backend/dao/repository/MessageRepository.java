package rafaros.backend.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import rafaros.backend.entities.Message;

@Transactional
//@CrossOrigin("*")//<= autorise tout appel/requête distant: 
@CrossOrigin("http://localhost:4200")          
//@RepositoryRestResource      
@Repository 
public interface MessageRepository extends JpaRepository<Message, Long>{

}
