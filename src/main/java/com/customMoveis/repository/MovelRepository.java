package com.customMoveis.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.customMoveis.model.movel.Movel;

@Repository
public interface MovelRepository extends JpaRepository<Movel, Integer> {
    @Query(value = "select u from movel u where u.logista_id = :id", nativeQuery = true)
    List<Movel> findAllByLogistaId(@Param("id") Integer id);
	
}