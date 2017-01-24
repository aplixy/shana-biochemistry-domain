package com.shana.biochemistry.condition;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="bioc_conition_t")
public class Condition implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4143765457762727720L;

	@Id
	@Column(name="id",length=64)
	private String id;
	
	@NotEmpty
	@Column(name="name",length=255)
	private String name;
	
	@NotNull   
	@Column(name="owner",length=64)
	private String owner;
	
	@Column(name="alias",length=255)
	private String alias;
	
	@Column(name="en_name",length=255)
	private String enName;

	@Column(name="en_alias",length=255)
    String enAlias;
	
	@Column(name="abbreviation",length=64)
	private String abbreviation;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public String getEnAlias() {
		return enAlias;
	}

	public void setEnAlias(String enAlias) {
		this.enAlias = enAlias;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	

}
