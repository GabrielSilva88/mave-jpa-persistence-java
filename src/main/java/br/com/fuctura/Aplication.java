package br.com.fuctura;

import br.com.fuctura.entity.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Aplication {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FUCTURA-PU");
		
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Usuario user = new Usuario();
		//user.setCodigo(1L);
		user.setNome("Gonçalves");
		user.setIdade(98);
		
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		Usuario userResult = em.find(Usuario.class, 1L);
		
		System.out.print("Nome: " + userResult.toString());
		
		// novo usuario
		Usuario user2 = new Usuario();
		//user.setCodigo(1L);
		user2.setNome("Breno");
		user2.setIdade(98);
		
		em.getTransaction().begin();
		em.persist(user2);
		em.getTransaction().commit();
		Usuario userResult2 = em.find(Usuario.class, 1L);
		//entityManagerFactory.close();
		
		// usuario 3
		
		Usuario user3 = new Usuario();
		//user.setCodigo(1L);
		user.setNome("Jerundio");
		user.setIdade(8);
		
		em.getTransaction().begin();
		em.persist(user3);
		em.getTransaction().commit();
		Usuario userResult3 = em.find(Usuario.class, 1L);
		
		// usuario 4
		
		Usuario user4 = new Usuario();
		//user.setCodigo(1L);
		user.setNome("Silvanydsh");
		user.setIdade(45);
		
		em.getTransaction().begin();
		em.persist(user4);
		em.getTransaction().commit();
		Usuario userResult4 = em.find(Usuario.class, 1L);
		
		// 
		try{
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
 