package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MundoRequest;

@RestController
@RequestMapping("app")
public class HolaMundoController {

	@GetMapping()
	public String hola( @RequestParam String hola ) {
		try {
			String saludo = hola.equals("hola") ? "mundo" : "Solicitud no válida";
			return saludo;
		} catch (NullPointerException e) {
			return "Ocurrió un error inesperado: " + e.getMessage();
		}
		
	}
	
	@PostMapping("{mundo}")
	public String mundo( @PathVariable String mundo) {
		String response = mundo.equals("mundo") ? "hola" : "Solicitud no válida";
		return response;
	}
	
	@PostMapping()
	public String mundo2( @RequestBody MundoRequest request) {
		String response = request.getMundo().equals("mundo") ? "hola" : "Solicitud no válida Body";
		return response;
	}
}
