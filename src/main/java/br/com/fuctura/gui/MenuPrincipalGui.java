package br.com.fuctura.gui;

import br.com.fuctura.config.JPAConfig;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class MenuPrincipalGui {

	public void show() {
		
		JPAConfig jpaConfig = new JPAConfig();
		
		EntityManager entityManager = jpaConfig.getEntityManager();
		
		
	}
}
