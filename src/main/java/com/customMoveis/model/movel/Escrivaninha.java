package com.customMoveis.model.movel;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "escrivaninha")
public class Escrivaninha extends Mesa{

    private Integer quantidadeDeGavetas;

    public Integer getQuantidadeDeGavetas() {
        return quantidadeDeGavetas;
    }

    public void setQuantidadeDeGavetas(Integer quantidadeDeGavetas) {
        this.quantidadeDeGavetas = quantidadeDeGavetas;
    }
    
}
