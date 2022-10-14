package com.customMoveis.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name = "lojista")
public class Lojista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String username;
	@Column
	@JsonIgnore
	private String password;
	@Column
    private String email;
	//@ManyToMany(fetch = FetchType.LAZY, cascade=CascadeType.MERGE)
//	@JoinTable(name = "moveis", joinColumns = @JoinColumn(name = "id"))
	@Column
	private ArrayList<String> moveis = new ArrayList<>();

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

	
	public ArrayList<String> getMoveis() {
		return this.moveis;
	}

	public void setMoveis(ArrayList<String> moveis) {
		this.moveis = moveis;
	}
	

}