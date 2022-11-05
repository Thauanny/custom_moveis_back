package com.customMoveis.model.movel;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.customMoveis.model.Lojista;
import com.customMoveis.model.Material;

import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "movel")
@Getter
@Setter
public class Movel {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer movel_id;
	private String name;
	private double valor;
	private double tamanho;
	private double largura;
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "lojista_id", referencedColumnName = "lojista_id",  foreignKey = @ForeignKey(name = "fk_lojista_id") )
	private Lojista lojista;


	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "material_id", referencedColumnName = "material_id", foreignKey = @ForeignKey(name = "fk_material_id"))
	private Material material;
	
}
