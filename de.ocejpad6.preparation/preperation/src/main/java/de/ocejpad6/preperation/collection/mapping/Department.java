package de.ocejpad6.preperation.collection.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Department {

	@Id
	@GeneratedValue
	private long id;

	/**
	 * Ascending is default order. The default order column is the primary key
	 * for entities.
	 */
	@OneToMany(mappedBy = "department")
	@OrderBy("name D b")
	private List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
