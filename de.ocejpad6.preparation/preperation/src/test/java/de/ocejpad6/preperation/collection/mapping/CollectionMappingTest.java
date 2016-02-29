package de.ocejpad6.preperation.collection.mapping;

import java.util.Arrays;

import org.junit.Test;

import de.ocejpad6.preperation.AbstractTransactionalTest;

public class CollectionMappingTest extends AbstractTransactionalTest {

	@Test
	public void collectionMapping() {
		Employee employee = new Employee();
		employee.setName("A");
		employee.setNickNames(Arrays.asList("A", "B"));
		em.persist(employee);

		employee = new Employee();
		employee.setName("B");
		employee.setNickNames(Arrays.asList("A", "B"));
		em.persist(employee);
	}

	@Test
	public void collectionOrdering() {
		// Employee c = new Employee();
		// c.setName("C");
		// c.setNickNames(Arrays.asList("C", "CC"));
		//
		// Employee a = new Employee();
		// a.setName("A");
		// a.setNickNames(Arrays.asList("A", "B"));
		//
		// Employee b = new Employee();
		// b.setName("B");
		// b.setNickNames(Arrays.asList("A", "B"));
		//
		// Department d = new Department();
		// a.setDepartment(d);
		// b.setDepartment(d);
		// c.setDepartment(d);
		// d.setEmployees(Arrays.asList(c, a, b));
		// em.persist(d);
		// em.persist(a);
		// em.persist(b);
		// em.persist(c);
		// em.flush();

		Department department = em.find(Department.class, 1L);
		System.out.println(department.getEmployees());
	}

	@Override
	public String getPersistenceUnit() {
		return "collectionMapping";
	}
}
