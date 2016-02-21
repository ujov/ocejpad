package de.ocejpad6.preperation.id.generation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity
public class Employee{
	
	@Id
	@GeneratedValue
	private long id;

}
