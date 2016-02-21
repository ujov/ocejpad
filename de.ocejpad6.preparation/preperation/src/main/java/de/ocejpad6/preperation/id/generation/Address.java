package de.ocejpad6.preperation.id.generation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Address
 *
 */
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	public long id;

}
