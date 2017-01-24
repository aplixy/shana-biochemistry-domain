package com.shana.biochemistry.reaction;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bioc_reaction_and_reaction_t")
public class ReactionAndReaction implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1861809737952910280L;

	@Id
	@Column(name="parent_id",length=64)
	private String parentReactionId;
	
	@Id
	@Column(name="sub_id",length=64)
	private String subReationId;

}
