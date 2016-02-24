package de.ocejpad6.preperation.mapping.manytoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Source. {@link ManyToOne} always on the owning side.
 * 
 * @author U4710646
 *
 */
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private long id;

	/**
	 * Without {@link JoinColumn} a default column name will be assumend:
	 * Attribute name + underscore + name of target primary key -->
	 * DEPARTMENT_ID.
	 */
	@ManyToOne
	private Department department;

}
