package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.modal.Person;
import com.springboot.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	
	public void save(Person person) {
	 
		personRepository.save(person);
	}

	public Person findByName(String firstname) {
		return personRepository.findByFirstName(firstname);
	}

	public List<Person> findAll() {
		
		return personRepository.findAll();
	}

}
