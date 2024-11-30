package br.com.fuctura.repository;

import jakarta.persistence.EntityManager;

public class VeiculoRepository {

	private final EntityManager emV;

	public VeiculoRepository(EntityManager emV) {
		super();
		this.emV = emV;
	}
	
	
}
