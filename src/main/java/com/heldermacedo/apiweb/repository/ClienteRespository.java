package com.heldermacedo.apiweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heldermacedo.apiweb.model.Cliente;

@Repository
public interface ClienteRespository extends JpaRepository<Cliente, Integer> {

}
