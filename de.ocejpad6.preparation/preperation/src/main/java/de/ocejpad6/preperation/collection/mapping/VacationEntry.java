package de.ocejpad6.preperation.collection.mapping;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class VacationEntry {

	@Temporal(TemporalType.DATE)
	private Calendar startDate;

	@Column(name = "DAYS")
	private int daysTaken;

}
