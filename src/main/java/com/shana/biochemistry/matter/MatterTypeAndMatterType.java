package com.shana.biochemistry.matter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bioc_matter_type_and_matter_type_t")
public class MatterTypeAndMatterType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2017478356898411248L;

	@Id
	@Column(name="parent_type_id",length=64)
	private String parentTypeId;
	
	@Id
	@Column(name="sub_type_id",length=64)
	private String subTypeId;

}
