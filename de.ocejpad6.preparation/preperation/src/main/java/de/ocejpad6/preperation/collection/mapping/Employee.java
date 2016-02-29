package de.ocejpad6.preperation.collection.mapping;

import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private long id;

	private String name;

	@ElementCollection(targetClass = VacationEntry.class)
	private Collection vacationBookings;

	@ElementCollection
	private Collection<String> nickNames;

	@ManyToOne
	@JoinColumn(name = "DEP_ID")
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public String getName() {
		return name;
	}

	public Collection<String> getNickNames() {
		return nickNames;
	}

	public Collection getVacationBookings() {
		return vacationBookings;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNickNames(Collection<String> nickNames) {
		this.nickNames = nickNames;
	}

	public void setVacationBookings(Collection vacationBookings) {
		this.vacationBookings = vacationBookings;
	}

	@Override
	public String toString() {
		return "Employee [id = " + id + " name = " + name + "]";
	}
}
