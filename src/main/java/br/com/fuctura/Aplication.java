package br.com.fuctura;

import java.util.List;

import br.com.fuctura.entity.Usuario;
import br.com.fuctura.repository.UsuarioRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Aplication {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FUCTURA-PU");
		
		EntityManager em = entityManagerFactory.createEntityManager();
		
		UsuarioRepository ur = new UsuarioRepository(em);
		
		Usuario user = new Usuario();
		//user.setCodigo(1L);
		user.setNome("Gonçalves");
		user.setIdade(98);
		
		ur.persist(user);
				
		// novo usuario
		Usuario user2 = new Usuario();
		//user.setCodigo(1L);
		user2.setNome("Breno");
		user2.setIdade(98);
		
		ur.equals(user2);
		
		Usuario userResult2 = em.find(Usuario.class, 1L);
		//entityManagerFactory.close();
		
		// usuario 3
		
		Usuario user3 = new Usuario();
		//user.setCodigo(1L);
		user.setNome("Jerundio");
		user.setIdade(78);
		
		ur.persist(user3);
		
		// usuario 4
		
		Usuario user4 = new Usuario();
		//user.setCodigo(1L);
		user.setNome("Silvanydsh");
		user.setIdade(45);
		
		ur.persist(user4);
		
		// usuario 5
		
		Usuario user5 = new Usuario();
		//user.setCodigo(1L);
		user.setNome("Silvanydsh");
		user.setIdade(56);
		
		ur.persist(user5);
		
		// usuario 6
		
		Usuario user6 = new Usuario();
		//user.setCodigo(1L);
		user.setNome("Silvanydsh");
		user.setIdade(94);
		
		ur.persist(user6);

		Usuario userResult = em.find(Usuario.class, 1L);
		
		System.out.print("Nome: " + userResult.toString());
		
		// cria a variavel para diversas consulta sem repetir o codigo.
		
		//List<Usuario> resultadoConsulta = ur.findUsuarioByIdade(50);
		List<Usuario> resultadoConsulta = ur.findAll(3,1);
		
		for (Usuario usuario : resultadoConsulta) {
			System.out.println("Resultado findAll: " + usuario);
		}

		Long resultadoConsultaI = ur.somatorioIdade();
		
			System.out.println("Resultado :" + resultadoConsultaI);
		
	}
}
 