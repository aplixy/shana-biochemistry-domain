package com.shana.biochemistry.matter;

public class MatterType {
	
	private String id;

	private String name;
	
	private String owner;
	
	private String alias;
	
	private String enName;
	
	private String enAlias;
	
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
