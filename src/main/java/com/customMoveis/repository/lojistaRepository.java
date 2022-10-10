package com.customMoveis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customMoveis.model.Lojista;

@Repository
public interface lojistaRepository extends CrudRepository<Lojista, Integer> {
	
	Lojista findByUsername(String username);
	
}