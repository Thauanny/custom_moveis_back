package com.customMoveis.model.movel;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import com.customMoveis.model.movel.enums.TIPOMESA;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mesa")
public class Mesa extends Movel{

    private Integer quantidadePernas;
    @Enumerated(EnumType.STRING)
    private TIPOMESA  tipomesa;

    public Integer getQuantidadePernas() {
        return quantidadePernas;
    }

    public void setQuantidadePernas(Integer quantidadePernas) {
        this.quantidadePernas = quantidadePernas;
    }


    
}
