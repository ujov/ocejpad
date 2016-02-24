package de.ocejpad6.preperation.id.generation.table;

import org.junit.Test;

import de.ocejpad6.preperation.AbstractTransactionalTest;

public class IdGenerationTableTest extends AbstractTransactionalTest {

	@Override
	public String getPersistenceUnit() {
		return "idGenerationTable";
	}

	@Test
	public void insertAddresses() {
		em.persist(new Address());
		em.persist(new Address());
		em.persist(new Address());
	}

	@Test
	public void insertDepartments() {
		em.persist(new Department());
		em.persist(new Department());
		em.persist(new Department());
	}

	@Test
	public void insertEmployees() {
		em.persist(new Employee());
		em.persist(new Employee());
		em.persist(new Employee());
	}

	@Test
	public void insertItems() {
		em.persist(new Item());
	}
}
