package org.bmo.customer.controller;

import java.util.List;

import org.bmo.customer.model.Person;
import org.bmo.customer.serviceImp.PersonServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	PersonServiceImp personService;
	
	@CrossOrigin
	@GetMapping("/persons")
	public List<Person> getAllPersons() {
		
		Person person = new Person("Daniel", "Kassa");
		Person person2 = new Person("Samuel", "Kassa");
		
		personService.savePerson(person);
		personService.savePerson(person2);

		
		List<Person> persons = personService.getPersons();
		return persons;
	}
	
	@CrossOrigin
	@GetMapping("/")
	public List<Person> getAllPersonsall() {
		
		Person person = new Person("Daniel", "Kassa");
		Person person2 = new Person("Samuel", "Kassa");
		
		personService.savePerson(person);
		personService.savePerson(person2);

		
		List<Person> persons = personService.getPersons();
		return persons;
	}

}
