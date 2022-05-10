package com.colombiaTour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.colombiaTour.models.entity.CentroComercial;
import com.colombiaTour.models.entity.Municipio;
import com.colombiaTour.models.entity.Negocio;
import com.colombiaTour.models.entity.Plato;
import com.colombiaTour.models.service.IDepartamentoService;
import com.colombiaTour.models.service.IMunicipioService;

@Controller
@RequestMapping
public class DepartamentoController {

	@Autowired
	private IDepartamentoService departServicee;

	@Autowired
	private IMunicipioService munSerivice;


	@GetMapping("/detalles")
	public String viewDetalles(Model model,String idd,String idm) {
		System.out.println(idd);
		System.out.println(idm);

		//Departamento depar=departServicee.findDepartamento(Integer.valueOf(idd));
		Municipio mun=munSerivice.findMunicipio(Integer.valueOf(idm));
		List<Plato> platos= mun.getGastronomia().getPlatos();
		List<Negocio> negocios= mun.getNegocio();
		List<CentroComercial> centrosc= mun.getCentrosc();
		model.addAttribute("municipio",mun);
		model.addAttribute("platos", platos);
		model.addAttribute("negocios", negocios);
		model.addAttribute("centrosc", centrosc);

		return "detalles";
	}
}
