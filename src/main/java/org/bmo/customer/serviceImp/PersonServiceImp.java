package org.bmo.customer.serviceImp;

import java.util.List;

import org.bmo.customer.dao.PersonDao;
import org.bmo.customer.model.Person;
import org.bmo.customer.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService {

	@Autowired
	PersonDao personDao;

	@Override
	public List<Person> getPersons() {

		List<Person> persons = personDao.findAll();

		return persons;
	}

	@Override
	public Person getOnePersons(int personid) {

		Person person = personDao.getOne(personid);

		return person;
	}

	@Override
	public void savePerson(Person person) {
    
		personDao.save(person);	
		
	}

}
