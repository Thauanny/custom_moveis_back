package com.customMoveis.model.movel;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sofa")
public class Sofa extends Movel {

    private boolean possuiBraco;
    private boolean reclinavel;

    public boolean isPossuiBraco() {
        return possuiBraco;
    }
    public void setPossuiBraco(boolean possuiBraco) {
        this.possuiBraco = possuiBraco;
    }
    public boolean isReclinavel() {
        return reclinavel;
    }
    public void setReclinavel(boolean reclinavel) {
        this.reclinavel = reclinavel;
    }

    
}
