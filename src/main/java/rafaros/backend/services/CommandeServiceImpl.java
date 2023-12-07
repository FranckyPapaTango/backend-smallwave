package rafaros.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafaros.backend.dao.repository.CommandeRepository;
import rafaros.backend.entities.Commande;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService{
	
	@Autowired
	CommandeRepository commandeRepository;

	@Override
	public Commande save(Commande commande) {
		// TODO Auto-generated method stub
		return commandeRepository.save(commande);
	}

	@Override
	public Commande findById(Long id) {
		// TODO Auto-generated method stub
		return commandeRepository.findById(id).orElse(null);
	}

	@Override
	public List<Commande> findAll() {
		// TODO Auto-generated method stub
		return commandeRepository.findAll();
	}

	@Override
	public Commande update(Commande commande) {
		// TODO Auto-generated method stub
		return commandeRepository.save(commande);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		commandeRepository.deleteById(id);
	}

}
