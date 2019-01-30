package id.netzme.client.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import id.netzme.client.model.Person;
import id.netzme.client.service.PersonService;

@RestController
@RequestMapping(value = "/api/person")
public class ClientController {

	private final PersonService personService;

	public ClientController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public Person getPerson(Model model) throws IOException {
		return personService.getPerson();
	}
}
