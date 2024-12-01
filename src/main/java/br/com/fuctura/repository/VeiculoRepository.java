package br.com.fuctura.repository;

import java.util.List;

import br.com.fuctura.entity.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class VeiculoRepository {

	private final EntityManager emV;

	public VeiculoRepository(EntityManager emV) {
		super();
		this.emV = emV;
	}
	
	public List<Veiculo> findAll(){
		// criar comando SQl 
				String comandoJPQL = "SELECT v from Veiculo v";
				
				// criar uma query ou "consulta"
				TypedQuery<Veiculo> findAll = emV.createQuery(comandoJPQL, Veiculo.class);
				
				// invoca comando sql do banco de dados
				List<Veiculo> ResultadoConsultaVeiculo = findAll.getResultList();
		return ResultadoConsultaVeiculo;
	}
	
	public void persistence(Veiculo v) {
		emV.getTransaction().begin();
		emV.persist(v);
		emV.getTransaction().commit();
	}
	
	public List<Veiculo> findVeiculoByPlaca(String Id_Placa){
		// criar comando SQl 
		String comandoJPQL = "SELECT v from veiculo v WHERE v.placa :Id_Placa";
		
		// criar uma query ou "consulta"
		TypedQuery<Veiculo> findAll = emV.createQuery(comandoJPQL, Veiculo.class);
		
		// implementa com o parametro do projeto
		findAll.setParameter("Id_Placa", Id_Placa);
		
		// invoca comando sql do banco de dados
		List<Veiculo> ResultadoConsultaVeiculo = findAll.getResultList();
		
		return ResultadoConsultaVeiculo;
	}
}
