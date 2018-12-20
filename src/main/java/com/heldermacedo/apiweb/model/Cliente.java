package com.heldermacedo.apiweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //Entidade
public class Cliente {
	@Id //anotação id
	@GeneratedValue //gerar valor para esse atributo
	private Integer id;
    private String nome;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
