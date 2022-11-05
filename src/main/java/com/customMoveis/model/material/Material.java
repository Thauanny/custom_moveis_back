package com.customMoveis.model.material;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.customMoveis.model.movel.enums.MATERIAIS;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "material")
public class Material {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer material_id;
	@Enumerated(EnumType.STRING)
	private MATERIAIS name;
	private double valor;


}
