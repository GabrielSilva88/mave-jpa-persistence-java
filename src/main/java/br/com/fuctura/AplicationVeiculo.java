package br.com.fuctura;

import java.util.List;

import br.com.fuctura.entity.Veiculo;
import br.com.fuctura.repository.VeiculoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class AplicationVeiculo {

	public static void main(String[] args) {
		
		EntityManagerFactory emfVeiculo = Persistence.createEntityManagerFactory("FUCTURA-PU");
		
		EntityManager emV = emfVeiculo.createEntityManager();
		
		VeiculoRepository vr = new VeiculoRepository(emV);
		
		Veiculo v = new Veiculo();
		
		v.setMarca("bmw");
		v.setModelo("x1");
		v.setPlaca("brd-1234");
		v.setAno(1990);
		v.setPreco(45.000);
		
		vr.persistence(v);

		Veiculo v2 = new Veiculo();
		
		v2.setMarca("toyota");
		v2.setModelo("etios");
		v2.setPlaca("gmg-1507");
		v2.setAno(1988);
		v2.setPreco(120.000);
		
		vr.persistence(v2);
		
		Veiculo v3 = new Veiculo();
		
		v3.setMarca("honda");
		v3.setModelo("fit");
		v3.setPlaca("sla-8097");
		v3.setAno(2014);
		v3.setPreco(94.000);
		
		vr.persistence(v3);
		
		Veiculo VeiculoResult = emV.find(Veiculo.class, 1L);
		
		List<Veiculo> ResultadoConsultaVeiculo = vr.findAll();
		
		for (Veiculo veiculo : ResultadoConsultaVeiculo) {

			System.out.println("Veiculo: " + VeiculoResult.toString());
		}
		
		
		
	}
}
