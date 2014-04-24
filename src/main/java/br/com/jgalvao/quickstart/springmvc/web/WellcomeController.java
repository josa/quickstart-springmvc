package br.com.jgalvao.quickstart.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WellcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(){
		return "QuickStart.home";
	}
	
}