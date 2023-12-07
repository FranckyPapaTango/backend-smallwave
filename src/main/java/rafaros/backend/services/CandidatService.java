package rafaros.backend.services;

import rafaros.backend.entities.Candidat;

import java.util.List;

public interface CandidatService {

	public Candidat save(Candidat candidat);

	public Candidat findById(Long id);

	public List<Candidat> findAll();

	public Candidat update(Candidat candidat);

	public void delete(Long id);

}


