package id.netzme.backend;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import id.netzme.client.service.PersonService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NetzmeBackedApplicationTests {

	private PersonService personService;

	public NetzmeBackedApplicationTests() {

	}

	public NetzmeBackedApplicationTests(PersonService personService) {
		this.personService = personService;
	}

	@Test
	public void contextLoads() {
		try {
			personService.getPerson();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
