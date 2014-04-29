package br.com.jgalvao.quickstart.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.jgalvao.quickstart.springmvc.model.Person;
import br.com.jgalvao.quickstart.springmvc.repository.PersonRepository;

@Service
@EnableTransactionManagement
public class PersonServiceImpl implements PersonService{

	private PersonRepository personRepository;

	@Autowired
	public void setPersonRepository(PersonRepository personRepository){
		this.personRepository = personRepository;
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void save(Person person) {
		this.personRepository.save(person);
	}

}
