package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.modal.Person;
import com.springboot.service.PersonServiceImpl;

@RestController
@RequestMapping("/spring")
public class PersonController {

@Autowired
private PersonServiceImpl personimpl;

@RequestMapping(value="/person",method=RequestMethod.POST)
public void save(Person person) throws Exception{
	 personimpl.save(person);
}

@RequestMapping(value="/person/{firstname}",method=RequestMethod.GET)
public Person getPersonByName(@PathVariable("firstname") String firstname) throws Exception{
	return personimpl.findByName(firstname);
}

@RequestMapping(value="/person",method=RequestMethod.GET,produces="application/json")
public List<Person> getAllPerson() throws Exception{
	System.out.println(personimpl.findAll());
	return personimpl.findAll();
}

}
