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
@Table(name = "sofa")
@Getter
@Setter
public class Sofa extends Movel {

    private boolean possuiBraco;
    private boolean reclinavel;
    private String img = "https://www.pngall.com/wp-content/uploads/2016/04/Sofa-Download-PNG.png";


    
}
