package de.ocejpad6.preperation.mapping.manytoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ItemOrder {

	@Id
	@GeneratedValue
	private long id;

}
