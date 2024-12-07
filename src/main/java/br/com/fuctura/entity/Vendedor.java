package br.com.fuctura.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="vendedor")
public class Vendedor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_vendedor")
	@SequenceGenerator(name = "id_vendedor", sequenceName = "id_vendedor", initialValue = 1, allocationSize = 1)
	private int id_vendedor;
	@Column(length = 80)
	private String nome;
	@Column(length = 80)
	private String cpf;
	 
	
	public int getId_vendedor() {
		return id_vendedor;
	}
	public void setId_vendedor(int id_vendedor) {
		this.id_vendedor = id_vendedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Vendedor [id_vendedor=" + id_vendedor + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	
}
