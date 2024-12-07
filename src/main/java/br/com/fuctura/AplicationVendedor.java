package br.com.fuctura;

import java.util.ArrayList;
import java.util.List;

import br.com.fuctura.entity.Vendedor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AplicationVendedor {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FUCTURA-PU");
		
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Vendedor vdr = new Vendedor();
		
		
		vdr.setNome("Gabriel");
		vdr.setCpf("789654321");
		
		Vendedor vendedorResult = em.find(Vendedor.class, 1L);
		
		// comando SQL
		
		
		List<Vendedor> resultadoVendedores = new ArrayList<Vendedor>();
		
		for (Vendedor vendedor : resultadoVendedores) {
			System.out.println("Consultar Vendedores: " + vendedor);
		}
		
		
		
	}
}
