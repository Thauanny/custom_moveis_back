package com.customMoveis.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.customMoveis.model.movel.enums.MATERIAIS;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "material")
public class Material {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer material_id;
	@Enumerated(EnumType.STRING)
	private MATERIAIS name;
	private double valor;

	public MATERIAIS getName() {
		return name;
	}

	public void setName(MATERIAIS name) {
		this.name = name;
	}

	public double getValor() {
		switch (this.name) {
			case MADEIRA:

				return 1.0;
			case MADEIRACOMVIDRO:

				return 3.5;
			case FERRO:

				return 4.0;

			default:
				return 0.0;
		}

	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
