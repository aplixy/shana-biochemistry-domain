package com.shana.biochemistry.matter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bioc_matter_and_matter_type_t")
public class MatterAndMatterType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3465401492569996485L;

	@Id
	@Column(name="matter_id",length=64)
	private String matterId;
	
	@Id
	@Column(name="matter_type_id",length=64)
	private String matterTypeId;
	
	
	public String getMatterId() {
		return matterId;
	}
	public void setMatterId(String matterId) {
		this.matterId = matterId;
	}
	public String getMatterTypeId() {
		return matterTypeId;
	}
	public void setMatterTypeId(String matterTypeId) {
		this.matterTypeId = matterTypeId;
	}

}
