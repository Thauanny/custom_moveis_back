package com.customMoveis.model;

import com.customMoveis.model.movel.Movel;
import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "lojista")
public class Lojista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer lojista_id;
	
	private String username;

	@JsonIgnore
	private String password;

    private String email;
	
	//@OneToMany(mappedBy = "lojista", cascade = CascadeType.ALL, orphanRemoval = true)
	//private List<Movel> moveis;
	


}