package br.com.jgalvao.quickstart.springmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.jgalvao.quickstart.springmvc.service.Test1Service;

@Controller
@Scope("request")
public class WellcomeController {

	private Test1Service test1Service;

	@Autowired
	public void setTest1Service(Test1Service test1Service){
		this.test1Service = test1Service;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(){
		this.test1Service.test();

		return "QuickStart.home";
	}
	
}