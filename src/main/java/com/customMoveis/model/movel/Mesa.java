package com.customMoveis.model.movel;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import com.customMoveis.model.movel.enums.TIPOMESA;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mesa")
@Getter
@Setter
public class Mesa extends Movel{

    private Integer quantidadePernas;
    @Enumerated(EnumType.STRING)
    private TIPOMESA  tipomesa;
    private String img = "https://imagensemoldes.com.br/wp-content/uploads/2020/06/Foto-Mesa-PNG.png";




    
}
