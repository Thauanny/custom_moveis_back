package com.customMoveis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "material")
public class Material {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long material_id;
    private String name;
    private double valor;   

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
    
}
