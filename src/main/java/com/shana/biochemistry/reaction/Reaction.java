package com.shana.biochemistry.reaction;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Reaction {
	
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

}
