package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.modal.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
	Person findByFirstName(String firstname);
	
	List<Person>findAll();

}
