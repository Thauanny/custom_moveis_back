package com.customMoveis.model;

import java.util.List;

public class LojistaDTO {
	private String username;
	private String password;
    private List<String> moveis;
    private String email;

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

	public List<String> getMoveis() {
		return moveis;
	}

	public void setMoveis(List<String> moveis) {
		this.moveis = moveis;
	}
}