package br.com.fuctura.config;

import java.beans.PersistenceDelegate;
import java.util.Objects;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAConfig {

	private static EntityManagerFactory emf = null;
	
	private EntityManagerFactory getInstance(String persistenceUnit) {
		if(Objects.isNull(emf)) {
			emf = Persistence.createEntityManagerFactory(persistenceUnit);
		}
		
		return emf;
	}
	
	public EntityManager getEntityManager() {
		return getInstance("FUCTURA-PU").createEntityManager();
	}
}
