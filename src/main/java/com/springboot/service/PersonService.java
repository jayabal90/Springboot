package com.springboot.service;

import java.util.List;

import com.springboot.modal.Person;

public interface PersonService {
	void save(Person person);
	Person findByName(String firstname);
	List<Person>findAll();

}
