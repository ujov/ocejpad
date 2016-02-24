package de.ocejpad6.preperation.mapping.manytoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {

	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	private ItemOrder order;

}
