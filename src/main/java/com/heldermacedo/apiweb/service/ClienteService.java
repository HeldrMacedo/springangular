package com.heldermacedo.apiweb.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heldermacedo.apiweb.model.Cliente;
import com.heldermacedo.apiweb.repository.ClienteRespository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRespository clienteRepository;
	
		    
	    //Regras de Negocios
	    public Cliente cadastrar(Cliente cliente) {
	    	return clienteRepository.save(cliente);
	    }
	    
	    public Collection<Cliente>buscarTodos(){
	        return clienteRepository.findAll();
	    }
	    
	    public void excluir(Cliente cliente) {
	    	clienteRepository.delete(cliente);
	    }
	    
	    public Cliente buscarPorId(Integer id) {
			// TODO Auto-generated method stub.
			return clienteRepository.findById(id).get();
		}
	    
	    public Cliente alterar(Cliente cliente) {
	    	
	    	return clienteRepository.save(cliente);
	    }
	    
	    
}
