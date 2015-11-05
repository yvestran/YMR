package org.yves.project.ymr.model;

// default package
// Generated Nov 4, 2015 9:42:25 AM by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbRecipes generated by hbm2java
 */
@Entity
@Table(name = "TbRecipes", catalog = "YMR")
public class TbRecipes implements java.io.Serializable {

	private Integer idRecipe;
	private TbUsers user;
	private String recipeDescription;
	private String recipeTitle;
	private Date recipePrepTime;
	private Date recipeCookTime;
	private Date recipeCreated;
	
	/*
	 * One To Many Relationship
	 */
	//For the organization of the ingredients
	private Collection<TbRecipeParts> recipeParts = new ArrayList<TbRecipeParts>();
	//For the body of the recipe
	private Collection<TbRecipeSteps> recipeSteps = new ArrayList<TbRecipeSteps>();
	private Collection<TbRecipeTips> recipeTips = new ArrayList<TbRecipeTips>();
	/*
	 * Many To Many Relationship
	 */
	private Collection<TbUsers> UserLikes = new ArrayList<TbUsers>();
	
	
	public TbRecipes() {
	}

	public TbRecipes(TbUsers user, String recipeTitle, Date recipeCreated) {
		this.user = user;
		this.recipeTitle = recipeTitle;
		this.recipeCreated = recipeCreated;
	}

	public TbRecipes(TbUsers user, String recipeDescription, String recipeTitle,
			Date recipePrepTime, Date recipeCookTime, Date recipeCreated) {
		this.user = user;
		this.recipeDescription = recipeDescription;
		this.recipeTitle = recipeTitle;
		this.recipePrepTime = recipePrepTime;
		this.recipeCookTime = recipeCookTime;
		this.recipeCreated = recipeCreated;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idRecipe", unique = true, nullable = false)
	public Integer getIdRecipe() {
		return this.idRecipe;
	}

	public void setIdRecipe(Integer idRecipe) {
		this.idRecipe = idRecipe;
	}
	
	@ManyToOne
	@JoinColumn(name="idUser")
	public TbUsers getUser() {
		return user;
	}

	public void setUser(TbUsers user) {
		this.user = user;
	}

	@Column(name = "recipeDescription")
	public String getRecipeDescription() {
		return this.recipeDescription;
	}

	public void setRecipeDescription(String recipeDescription) {
		this.recipeDescription = recipeDescription;
	}

	@Column(name = "recipeTitle", nullable = false)
	public String getRecipeTitle() {
		return this.recipeTitle;
	}

	public void setRecipeTitle(String recipeTitle) {
		this.recipeTitle = recipeTitle;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "recipePrepTime", length = 8)
	public Date getRecipePrepTime() {
		return this.recipePrepTime;
	}

	public void setRecipePrepTime(Date recipePrepTime) {
		this.recipePrepTime = recipePrepTime;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "recipeCookTime", length = 8)
	public Date getRecipeCookTime() {
		return this.recipeCookTime;
	}

	public void setRecipeCookTime(Date recipeCookTime) {
		this.recipeCookTime = recipeCookTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "recipeCreated", nullable = false, length = 19)
	public Date getRecipeCreated() {
		return this.recipeCreated;
	}

	public void setRecipeCreated(Date recipeCreated) {
		this.recipeCreated = recipeCreated;
	}

	@OneToMany(mappedBy="recipe")
	public Collection<TbRecipeParts> getRecipeParts() {
		return recipeParts;
	}

	public void setRecipeParts(Collection<TbRecipeParts> recipeParts) {
		this.recipeParts = recipeParts;
	}
	
	@OneToMany(mappedBy="recipe")
	public Collection<TbRecipeSteps> getRecipeSteps() {
		return recipeSteps;
	}

	public void setRecipeSteps(Collection<TbRecipeSteps> recipeSteps) {
		this.recipeSteps = recipeSteps;
	}

	@OneToMany(mappedBy="recipe")
	public Collection<TbRecipeTips> getRecipeTips() {
		return recipeTips;
	}

	public void setRecipeTips(Collection<TbRecipeTips> recipeTips) {
		this.recipeTips = recipeTips;
	}

	@ManyToMany(mappedBy="recipesLiked")
	public Collection<TbUsers> getUserLikes() {
		return UserLikes;
	}

	public void setUserLikes(Collection<TbUsers> userLikes) {
		UserLikes = userLikes;
	}

	
	
}