package rafaros.backend.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

	@RequestMapping("/")
	public String getHelloWorld() {
		return "Bienvenu dans l'Endpoint du RestController ! ";
	}
}
