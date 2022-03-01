package com.generation.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.demo.models.SalonModel;

@Repository
public interface SalonRepository extends JpaRepository<SalonModel, Integer> {
// Hereda de una clase de Spring, pide el modelo de la clase y el tipo de dato que pide como ID 
// JpaRepository<Entity, ID>
	
}
