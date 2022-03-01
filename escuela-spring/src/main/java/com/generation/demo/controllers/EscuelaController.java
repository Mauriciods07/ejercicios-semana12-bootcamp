package com.generation.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.demo.models.SalonModel;
import com.generation.demo.services.SalonService;

@RestController
public class EscuelaController {

	private final SalonService salonService;
	
	public EscuelaController( @Autowired SalonService salonService ) {
		this.salonService = salonService;
	}
	
	// mostrar datos de salón
	@GetMapping("/salon")
	public ArrayList<SalonModel> obtenerDato() {
		return salonService.obtenerDatos();
	}
	
	
	// Guardar datos en la tabla salon
	// Este método hará uso de una parte importante del url
	@PostMapping("/salon")
	public SalonModel guardarDatos(@RequestBody SalonModel salonModel) {
		return salonService.guardarDatos(salonModel);
	}
	
	// elminar dato
	@DeleteMapping(path = "/salon/{id}") // path variable // localhost:port/salon/{id} -> localhost:8090/salon/1
	public boolean eliminarDato(@PathVariable("id") Integer id) {
		return salonService.eliminarDato(id);
	}
	
}
