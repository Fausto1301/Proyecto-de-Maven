 package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/socio")
public class Controlador {
	@Autowired
	SocioService servicio;
	@GetMapping("/listar")
	public List<EntidadSocio>listar(){
		return servicio.listar();
	}
	
	@PostMapping("/add")
	public EntidadSocio agregar(@RequestBody EntidadSocio s) {
		return servicio.add(s);
	}

}
