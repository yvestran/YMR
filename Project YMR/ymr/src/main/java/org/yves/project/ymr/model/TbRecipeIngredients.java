package org.yves.project.ymr.model;

// default package
// Generated Nov 4, 2015 9:42:25 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TbRecipeIngredients generated by hbm2java
 */
@Entity
@Table(name = "TbRecipeIngredients", catalog = "YMR", uniqueConstraints = @UniqueConstraint(columnNames = {
		"idRecipePart", "idIngredient" }))
public class TbRecipeIngredients implements java.io.Serializable {

	private Integer idRecipeIngredient;
	private int idRecipePart;
	private int idIngredient;
	private int idMeasure;
	private int ingredientOrder;
	private byte amount;

	public TbRecipeIngredients() {
	}

	public TbRecipeIngredients(int idRecipePart, int idIngredient,
			int idMeasure, int ingredientOrder, byte amount) {
		this.idRecipePart = idRecipePart;
		this.idIngredient = idIngredient;
		this.idMeasure = idMeasure;
		this.ingredientOrder = ingredientOrder;
		this.amount = amount;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idRecipeIngredient", unique = true, nullable = false)
	public Integer getIdRecipeIngredient() {
		return this.idRecipeIngredient;
	}

	public void setIdRecipeIngredient(Integer idRecipeIngredient) {
		this.idRecipeIngredient = idRecipeIngredient;
	}

	@Column(name = "idRecipePart", nullable = false)
	public int getIdRecipePart() {
		return this.idRecipePart;
	}

	public void setIdRecipePart(int idRecipePart) {
		this.idRecipePart = idRecipePart;
	}

	@Column(name = "idIngredient", nullable = false)
	public int getIdIngredient() {
		return this.idIngredient;
	}

	public void setIdIngredient(int idIngredient) {
		this.idIngredient = idIngredient;
	}

	@Column(name = "idMeasure", nullable = false)
	public int getIdMeasure() {
		return this.idMeasure;
	}

	public void setIdMeasure(int idMeasure) {
		this.idMeasure = idMeasure;
	}

	@Column(name = "ingredientOrder", nullable = false)
	public int getIngredientOrder() {
		return this.ingredientOrder;
	}

	public void setIngredientOrder(int ingredientOrder) {
		this.ingredientOrder = ingredientOrder;
	}

	@Column(name = "amount", nullable = false, precision = 2, scale = 0)
	public byte getAmount() {
		return this.amount;
	}

	public void setAmount(byte amount) {
		this.amount = amount;
	}

}