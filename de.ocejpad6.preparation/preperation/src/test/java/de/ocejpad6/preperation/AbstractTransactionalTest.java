package de.ocejpad6.preperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;

public abstract class AbstractTransactionalTest {
	
	private EntityTransaction transaction;
	
	protected EntityManager em;

	
	@Before
	public void setUp(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(getPersistenceUnit());
		em = emf.createEntityManager();
		transaction = em.getTransaction();
		transaction.begin();	
	}
	
	@After
	public void tearDown(){
		transaction.commit();
		em.close();
	}

	public abstract String getPersistenceUnit();
}
