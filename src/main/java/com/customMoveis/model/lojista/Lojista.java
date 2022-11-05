package com.customMoveis.model.lojista;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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

}