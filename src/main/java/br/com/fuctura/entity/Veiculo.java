package br.com.fuctura.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "veiculo")
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_veiculo")
	@SequenceGenerator(name = "id_veiculo", sequenceName = "id_veiculo", initialValue = 1, allocationSize = 1)
	private Long id_veiculo;

	@Column(length = 50)
	private String modelo;
	@Column(length = 50)
	private String placa;
	@Column(length = 50)
	private String marca;
	@Column(precision = 50)
	private Integer ano;
	@Column(nullable = false)
	private Double preco;

	public Long getId_veiculo() {
		return id_veiculo;
	}

	public void setId_veiculo(Long id_veiculo) {
		this.id_veiculo = id_veiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Veiculo [id_veiculo=" + id_veiculo + ", modelo=" + modelo + ", placa=" + placa + ", marca=" + marca
				+ ", ano=" + ano + ", preco=" + preco + "]";
	}

}
