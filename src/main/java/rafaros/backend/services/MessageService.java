package rafaros.backend.services;

import rafaros.backend.entities.Message;

import java.util.List;

public interface MessageService {
	public Message save (Message message );
	public Message findById(Long id);
	public List<Message> findAll();
	public Message update(Message message);
	public void delete(Long id);
}
