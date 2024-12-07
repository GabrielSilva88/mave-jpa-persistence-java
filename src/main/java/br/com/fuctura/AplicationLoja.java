package br.com.fuctura;

import br.com.fuctura.entity.Loja;
import br.com.fuctura.repository.LojaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AplicationLoja {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FUCTURA-PU");
		
		EntityManager em = emf.createEntityManager();
		
		LojaRepository lr = new LojaRepository(em);
		
		Loja l = new Loja();
		
		
	}
}
