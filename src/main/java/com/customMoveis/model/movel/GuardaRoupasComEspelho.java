package com.customMoveis.model.movel;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "guarda_roupa_com_espelho")
@Getter
@Setter
public class GuardaRoupasComEspelho  extends GuardaRoupa{

    private Integer quantidadeEspelhos;
    private String img = "https://images.tcdn.com.br/img/img_prod/553077/guarda_roupa_casal_com_espelho_6_portas_estrela_niagara_rv_moveis_1784_1_20190306150816.png";
}
