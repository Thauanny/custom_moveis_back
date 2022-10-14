package com.customMoveis.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lojista")
public class Lojista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long lojista_id;

	private String username;

	@JsonIgnore
	private String password;

    private String email;
	
	@OneToMany(targetEntity = Movel.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "lojista_movel_fk", referencedColumnName = "lojista_id")
	private List<Movel> moveis;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public List<Movel>  getMoveis() {
		return this.moveis;
	}

	public void setMoveis(List<Movel>  moveis) {
		this.moveis = moveis;
	}
	

}