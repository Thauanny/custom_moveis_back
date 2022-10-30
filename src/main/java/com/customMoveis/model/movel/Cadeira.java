package com.customMoveis.model.movel;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cadeira")
public class Cadeira  extends Movel{

    private Integer quantidadePernas;
	private boolean possuiAcolchoado;


    public boolean isPossuiAcolchoado() {
		return possuiAcolchoado;
	}

	public void setPossuiAcolchoado(boolean possuiAcolchoado) {
		this.possuiAcolchoado = possuiAcolchoado;
	}

	public int getQuantidadePernas() {
		return this.quantidadePernas;
	}

	public void setQuantidadePernas(int quantidadePernas) {
		this.quantidadePernas = quantidadePernas;
	}
}
