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
@Table(name = "escrivaninha")
@Getter
@Setter
public class Escrivaninha extends Mesa{

    private Integer quantidadeDeGavetas;
    private String img = "https://www.extra-imagens.com.br/html/conteudo-produto/93/10982366/imagens/mesa_1.png";
   
    
}
