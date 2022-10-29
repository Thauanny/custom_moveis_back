package com.customMoveis.model.dto;
import java.util.List;
import com.customMoveis.model.movel.Movel;

public class LojistaDTO {
	private Integer lojista_id;
	private String username;
	private String password;
    private List<Movel> moveis;
    private String email;

	public long getLojista_id() {
		return lojista_id;
	}


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

	public List<Movel> getMoveis() {
		return moveis;
	}

	public void setMoveis(List<Movel> moveis) {
		this.moveis = moveis;
	}


}