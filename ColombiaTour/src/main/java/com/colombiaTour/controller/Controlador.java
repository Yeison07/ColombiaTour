package com.colombiaTour.controller;





import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class Controlador {



	@GetMapping("/home")
	public String home() {

		return "index";
	}

	@GetMapping("/quienesSomos")
	public String quienesSomos() {
		return "quienessomos";
	}

	@GetMapping("/seguridad")
	public String seguridad() {
		return "seguridad";
	}

	@GetMapping("/visa")
	public String visa() {
		return "visas";
	}

	@GetMapping("/mapaCompleto")
	public String mapaC() {
		return "mapa";
	}

	@GetMapping("/moneda")
	public String moneda() {
		return "moneda";
	}
}
