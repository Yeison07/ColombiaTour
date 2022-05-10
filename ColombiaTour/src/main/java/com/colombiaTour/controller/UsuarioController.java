package com.colombiaTour.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.colombiaTour.models.entity.Usuario;
import com.colombiaTour.models.service.IUsuarioService;

@Controller
@RequestMapping
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;

	@GetMapping("/formRegistro")
	public String formRegistro(Model model) {
		Usuario usuario= new Usuario();

		model.addAttribute("usuario",usuario);
		return "Registro";
	}

	@PostMapping("/formRegistro/insertU")
	public String insertarUser(@ModelAttribute Usuario usuario) {
		usuarioService.insertar(usuario);
		System.out.println("Usuario registrado");
		return "redirect:/indexlogin";
	}

	@GetMapping("/indexlogin")
	public String formLogin(Model model) {
		model.addAttribute("usuario",new Usuario());
		return "indexlogin";
	}




}
