package com.shana.biochemistry.equation;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.shana.biochemistry.condition.Condition;
import com.shana.biochemistry.location.Location;
import com.shana.biochemistry.matter.Matter;
import com.shana.biochemistry.reaction.Reaction;

@Entity
@Table(name="bioc_equation_t")
public class Equation implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2966226803899676091L;

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
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH }, optional = true)  
    @JoinColumn(name="reaction_id")
	private Reaction reaction;

	@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.PERSIST,CascadeType.MERGE})  
	    @JoinTable(name="bioc_equation_condition_t",    
	        joinColumns={    
	            @JoinColumn(name="equation_id",referencedColumnName="id")    
	            },    
	            inverseJoinColumns={    
	             @JoinColumn(name="condition_id",referencedColumnName="id")    
	       }    
	    )   
	private List<Condition> conditions;
	
	@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.PERSIST,CascadeType.MERGE})  
    @JoinTable(name="bioc_equation_input_matter_t",    
        joinColumns={    
            @JoinColumn(name="equation_id",referencedColumnName="id")    
            },    
            inverseJoinColumns={    
             @JoinColumn(name="matter_id",referencedColumnName="id")    
       }    
    ) 
	private List<Matter> inputMatters;
	
	
	@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.PERSIST,CascadeType.MERGE})  
    @JoinTable(name="bioc_equation_output_matter_t",    
        joinColumns={    
            @JoinColumn(name="equation_id",referencedColumnName="id")    
            },    
            inverseJoinColumns={    
             @JoinColumn(name="matter_id",referencedColumnName="id")    
       }    
    ) 
	private List<Matter> outputMatters;
	
	
	@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.PERSIST,CascadeType.MERGE})  
    @JoinTable(name="bioc_equation_location_t",    
        joinColumns={    
            @JoinColumn(name="equation_id",referencedColumnName="id")    
            },    
            inverseJoinColumns={    
             @JoinColumn(name="location_id",referencedColumnName="id")    
       }    
    ) 
	private List<Location> locations;
	
	
}
