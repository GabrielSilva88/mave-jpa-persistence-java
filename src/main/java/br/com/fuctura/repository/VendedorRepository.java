package br.com.fuctura.repository;

import java.util.List;

import br.com.fuctura.entity.Vendedor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class VendedorRepository {

	private final EntityManager em;
	
	public VendedorRepository(EntityManager em) {
		super();
		this.em = em;
	}
	
	public List<Vendedor> findAll(){
		
		// comando SQL
		String comandoSql = "SELECT v FROM vendedor v";
	
		// criar query "consulta"
		TypedQuery<Vendedor> findAll = em.createNamedQuery(comandoSql, Vendedor.class);
		
		// invocar consulta
		List <Vendedor> resutadoConsulta = findAll.getResultList();
		
		return resutadoConsulta;
	}
	
	
	
}
