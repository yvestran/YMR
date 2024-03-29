package org.yves.project.ymr.model;

// default package
// Generated Nov 4, 2015 9:42:25 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TbLikes generated by hbm2java
 */
@Entity
@Table(name = "TbLikes", catalog = "YMR")
public class TbLikes implements java.io.Serializable {

	private TbLikesId id;

	public TbLikes() {
	}

	public TbLikes(TbLikesId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idRecipe", column = @Column(name = "idRecipe", nullable = false)),
			@AttributeOverride(name = "idUser", column = @Column(name = "idUser", nullable = false)) })
	public TbLikesId getId() {
		return this.id;
	}

	public void setId(TbLikesId id) {
		this.id = id;
	}

}
