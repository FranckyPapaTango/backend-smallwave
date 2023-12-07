package rafaros.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafaros.backend.dao.repository.MessageRepository;
import rafaros.backend.entities.Message;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	MessageRepository messageRepository;

	@Override
	public Message save(Message message) {
		// TODO Auto-generated method stub
		return messageRepository.save(message);
	}

	@Override
	public Message findById(Long id) {
		// TODO Auto-generated method stub
		return messageRepository.findById(id).orElse(null);
	}

	@Override
	public List<Message> findAll() {
		// TODO Auto-generated method stub
		return messageRepository.findAll();
	}

	@Override
	public Message update(Message message) {
		// TODO Auto-generated method stub
		return messageRepository.save(message);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		messageRepository.deleteById(id);
	}

}
