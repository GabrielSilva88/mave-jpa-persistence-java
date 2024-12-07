package br.com.fuctura.repository;

import java.awt.Window.Type;
import java.util.List;

import br.com.fuctura.entity.Loja;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class LojaRepository {

	private final EntityManager em;

	public LojaRepository(EntityManager em) {
		super();
		this.em = em;
	}
	
	public List<Loja> findAll(){
		
		// comando SQL
		String comandoSql = "SELECT * FROM loja l";
		
		// criar consulta "query"
		TypedQuery<Loja> findAll = em.createNamedQuery(comandoSql, Loja.class);
		
		//invocar dados 
		List<Loja> resutladoConsulta = findAll.getResultList();
		
		return resutladoConsulta;
	}
}
