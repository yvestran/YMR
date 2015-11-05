package org.yves.project.ymr.model;

// default package
// Generated Nov 4, 2015 9:42:25 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TbConversion generated by hbm2java
 */
@Entity
@Table(name = "TbConversion", catalog = "YMR", uniqueConstraints = @UniqueConstraint(columnNames = {
		"idMeasure1", "idMeasure2" }))
public class TbConversion implements java.io.Serializable {

	private TbConversionId id;

	public TbConversion() {
	}

	public TbConversion(TbConversionId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idMeasure1", column = @Column(name = "idMeasure1", nullable = false)),
			@AttributeOverride(name = "idMeasure2", column = @Column(name = "idMeasure2", nullable = false)),
			@AttributeOverride(name = "multiplier", column = @Column(name = "multiplier", nullable = false, precision = 5, scale = 0)) })
	public TbConversionId getId() {
		return this.id;
	}

	public void setId(TbConversionId id) {
		this.id = id;
	}

}
