package br.com.jgalvao.quickstart.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jgalvao.quickstart.springmvc.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}