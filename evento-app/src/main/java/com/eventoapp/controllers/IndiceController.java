package com.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndiceController {
	
	@RequestMapping("/ola")
	public String olaSpring () {
		return "Indice";
	}

}
