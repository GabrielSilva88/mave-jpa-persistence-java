package br.com.fuctura.repository;

import java.util.List;

import br.com.fuctura.entity.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class UsuarioRepository {

	private final EntityManager em;
	
	public UsuarioRepository(EntityManager em) {
		super();
		this.em = em;
	}

	public List<Usuario> findAll(int qtdRegistro, int pagina){
		// criar comando JPQL
				String comandoJqpl = "SELECT u FROM Usuario u";
				
				// criar Query "constual"
				TypedQuery<Usuario> findAll = em.createQuery(comandoJqpl, Usuario.class);
				
				findAll.setFirstResult(pagina);
				findAll.setMaxResults(qtdRegistro);
				// Invocar o comando
				List<Usuario> resultConsulta = findAll.getResultList();
				
				return resultConsulta;
	}
	
	public List<Usuario> findAll(){
		// criar comando JPQL
				String comandoJqpl = "SELECT u FROM Usuario u";
				
				// criar Query "constual"
				TypedQuery<Usuario> findAll = em.createQuery(comandoJqpl, Usuario.class);
				
				// Invocar o comando
				List<Usuario> resultConsulta = findAll.getResultList();
				
				return resultConsulta;
	}
	
	// metodo para filtrar por coluna ou item especifico.
	public List<Usuario> findUsuarioByIdade(Integer idade){
		// criar comando JPQL
				String comandoJqpl = "SELECT u FROM Usuario u WHERE u.idade > :IdadeFiltro";
				
				// criar Query "constual"
				TypedQuery<Usuario> findAll = em.createQuery(comandoJqpl, Usuario.class);
				
				findAll.setParameter("IdadeFiltro", idade);
				
				// Invocar o comando
				List<Usuario> resultConsulta = findAll.getResultList();
				
				return resultConsulta;
	}
	
	public Long somatorioIdade() {
		// criar comando SQL
		String comandoJqpl = "SELECT SUM (u.idade) from Usuario u";
		
		// criar uma consulta para o somatorio
		TypedQuery<Long> findAll = em.createQuery(comandoJqpl, Long.class);
		
		// invocar o comando
		Long resultadoConsulta = findAll.getSingleResult();
		
		return resultadoConsulta;
	}
	
	// metodo para o processo de salvar usuario. 
	public void persist(Usuario u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
	}
	
	
}
