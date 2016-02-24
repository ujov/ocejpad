package de.ocejpad6.preperation.mapping.manytoone;

import org.junit.Test;

import de.ocejpad6.preperation.AbstractTransactionalTest;

public class ManyToOneTest extends AbstractTransactionalTest {

	@Override
	public String getPersistenceUnit() {
		return "mappingManyToOne";
	}

	@Test
	public void manyToOneWithJoinColumn() {
		em.persist(new OrderItem());
		em.persist(new ItemOrder());

	}

	@Test
	public void manyToOneWithoutJoinColumn() {
		em.persist(new Employee());
		em.persist(new Department());
	}
}
