package com.iglesia.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsultaController2 {
	
	@GetMapping("/plantilla/Consultar/")
	public String index() {
		return "/plantilla/Consultar/Consulta";
		
	}

}
