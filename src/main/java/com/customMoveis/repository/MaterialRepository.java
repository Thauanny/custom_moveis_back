package com.customMoveis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customMoveis.model.material.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> {

}