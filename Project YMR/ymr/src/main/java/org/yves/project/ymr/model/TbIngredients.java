package org.yves.project.ymr.model;

// default package
// Generated Nov 4, 2015 9:42:25 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TbIngredients generated by hbm2java
 */
@Entity
@Table(name = "TbIngredients", catalog = "YMR")
public class TbIngredients implements java.io.Serializable {

	private Integer idIngredient;
	private String ingredientName;

	public TbIngredients() {
	}

	public TbIngredients(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idIngredient", unique = true, nullable = false)
	public Integer getIdIngredient() {
		return this.idIngredient;
	}

	public void setIdIngredient(Integer idIngredient) {
		this.idIngredient = idIngredient;
	}

	@Column(name = "ingredientName", nullable = false)
	public String getIngredientName() {
		return this.ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

}
