package br.com.fuctura;

import br.com.fuctura.entity.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AplicationVeiculo {

	public static void main(String[] args) {
		
		EntityManagerFactory emfVeiculo = Persistence.createEntityManagerFactory("FUCTURA-PU");
		
		EntityManager emV = emfVeiculo.createEntityManager();
		
		Veiculo v = new Veiculo();
		
		v.setMarca("bmw");
		v.setModelo("x1");
		v.setPlaca("brd-1234");
		v.setAno(1990);
		v.setPreco(45.000);
		
		emV.getTransaction().begin();
		emV.persist(v);
		emV.getTransaction().commit();
		
		Veiculo VeiculoResult = emV.find(Veiculo.class, 1L);
		
		System.out.println("Veiculo: " + VeiculoResult.toString());
		
	}
}
