package org.bmo.customer.service;

import java.util.List;

import org.bmo.customer.model.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {
	
	public List<Person> getPersons();
	public Person getOnePersons(int personid);
	
	public void savePerson(Person person);

}
