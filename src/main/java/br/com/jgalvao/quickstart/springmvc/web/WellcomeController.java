package br.com.jgalvao.quickstart.springmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.jgalvao.quickstart.springmvc.model.Person;
import br.com.jgalvao.quickstart.springmvc.service.PersonService;
import br.com.jgalvao.quickstart.springmvc.service.Test1Service;

@Controller
@Scope("request")
public class WellcomeController {

	private Test1Service test1Service;
	private PersonService personService;

	@Autowired
	public void setTest1Service(Test1Service test1Service){
		this.test1Service = test1Service;
	}

	@Autowired
	public void setPersonService(PersonService personService){
		this.personService = personService;
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(){
		this.test1Service.test();

		return "QuickStart.home";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public ModelAndView save(ModelAndView modelAndView, Person person){
		
		this.personService.save(person);
		
		return modelAndView;
	}
	
}