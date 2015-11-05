package org.yves.project.ymr.model;

// default package
// Generated Nov 4, 2015 9:42:25 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TbRecipeSteps generated by hbm2java
 */
@Entity
@Table(name = "TbRecipeSteps", catalog = "YMR")
public class TbRecipeStepTips implements java.io.Serializable {

	private Integer idRecipeStepTips;
	private TbRecipeSteps recipeStep;
	private String tipsDescription;

	public TbRecipeStepTips() {
	}

	public TbRecipeStepTips(TbRecipeSteps recipeStep, String tipsDescription) {
		this.recipeStep = recipeStep;
		this.tipsDescription = tipsDescription;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idRecipeStepTips", unique = true, nullable = false)
	public Integer getIdRecipeStepTips() {
		return this.idRecipeStepTips;
	}

	public void setIdRecipeStepTips(Integer idRecipeStepTips) {
		this.idRecipeStepTips = idRecipeStepTips;
	}

	@Column(name = "tipsDescription", nullable = false)
	public String getTipsDescription() {
		return this.tipsDescription;
	}

	public void setTipsDescription(String tipsDescription) {
		this.tipsDescription = tipsDescription;
	}


	@ManyToOne
	@JoinColumn(name="idRecipeStep")
	public TbRecipeSteps getRecipeStep() {
		return recipeStep;
	}

	public void setRecipeStep(TbRecipeSteps recipeStep) {
		this.recipeStep = recipeStep;
	}

	
}