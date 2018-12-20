package com.heldermacedo.apiweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.heldermacedo.apiweb.model.Estado;
import com.heldermacedo.apiweb.service.EstadoService;


@RestController
public class EstadoController {
	
	@Autowired
	EstadoService estadoService;
	
	@RequestMapping(method=RequestMethod.POST, value="/estados", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Estado> cadastrarEstado(@RequestBody Estado estado) {
		
		Estado estadoCadastrar = estadoService.cadastrarEstado(estado);
		
		return new ResponseEntity<>(estadoCadastrar,HttpStatus.CREATED);
	}
}
