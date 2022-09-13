package com.iglesia.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeligresesController {
	
	@GetMapping("/plantilla/Feligreses/")
	public String index() {
		return "/plantilla/Feligreses/listar";
		
	}

}
