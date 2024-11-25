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
		
		//entityManagerFactory.close();
		
		try{
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
