package com.customMoveis.model.movel;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Entity
@Table(name = "guarda_roupa")
@Inheritance(strategy = InheritanceType.JOINED)
public class GuardaRoupa extends Movel {
;
    
}
