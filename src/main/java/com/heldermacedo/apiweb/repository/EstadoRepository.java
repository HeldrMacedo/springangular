package com.heldermacedo.apiweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heldermacedo.apiweb.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

	
}
