package com.shana.biochemistry.reaction;

import javax.persistence.Column;

import org.hibernate.validator.constraints.NotEmpty;

public class ReactionRelationship {
	
	@NotEmpty
	@Column(name="parent_id",length=64)
	private String parentReactionId;
	
	@NotEmpty
	@Column(name="sub_id",length=64)
	private String subReationId;

}
