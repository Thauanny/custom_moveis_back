package com.customMoveis.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customMoveis.model.movel.Movel;

@Repository
public interface MovelRepository extends JpaRepository<Movel, Integer> {

	
}