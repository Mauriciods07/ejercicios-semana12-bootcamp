package com.generation.demo.models;

import javax.persistence.Column;
// para comenzar a trabajar con BD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// BD y nombre de la tabla
@Entity
@Table(name="salon")
public class SalonModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // agregar un valor AI
	@Column(unique = true, nullable = false) // nullable -> no sea nula
	private Integer id;
	
	@Column(name = "materia", nullable = false, length = 120)
	private String materia;
	
	@Column(name = "maestro", nullable = false, length = 120)
	private String maestro;
	
	public SalonModel() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getMaestro() {
		return maestro;
	}
	public void setMaestro(String maestro) {
		this.maestro = maestro;
	}
	@Override
	public String toString() {
		return "EscuelaModel [id=" + id + ", materia=" + materia + ", maestro=" + maestro + "]";
	}
	
}
