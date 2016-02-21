package de.ocejpad6.preperation.id.generation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Item {

	@TableGenerator(name = "TB_GEN", table = "HIBERNATE_SEQUENCES", pkColumnName = "SEQUENCE_NAME", pkColumnValue = "SEQUENCE_NEXT_HI_VALUE")
	@Id
	@GeneratedValue(generator = "TB_GEN", strategy = GenerationType.TABLE)
	public long id;

}
