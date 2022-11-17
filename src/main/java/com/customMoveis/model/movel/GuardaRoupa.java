package com.customMoveis.model.movel;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.InheritanceType;

@Entity
@Table(name = "guarda_roupa")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public class GuardaRoupa extends Movel {
    private Integer quantidadePortas;
    private String img = "https://www.extra-imagens.com.br/html/conteudo-produto/93/55005223/imagens/guarda-roupa_1.png";

}
