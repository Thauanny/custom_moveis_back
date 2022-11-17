package com.customMoveis.model.movel;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cadeira")
@Getter
@Setter
public class Cadeira  extends Movel{

    private Integer quantidadePernas;
	private boolean possuiAcolchoado;
	private String img = "https://upload.wikimedia.org/wikipedia/commons/5/5a/Cadeira-madeira.png";

}
