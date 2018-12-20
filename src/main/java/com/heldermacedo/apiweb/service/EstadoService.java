package com.heldermacedo.apiweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.heldermacedo.apiweb.model.Estado;
import com.heldermacedo.apiweb.repository.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	EstadoRepository estadoRepository;
	
	public Estado cadastrarEstado(Estado estado) {
		return estadoRepository.save(estado);
	}
}
