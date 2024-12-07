package br.com.fuctura.entity;

public class Loja {

	private int id_loja;
	private String nome;
	private String endereco;

	public int getId_loja() {
		return id_loja;
	}

	public void setId_loja(int id_loja) {
		this.id_loja = id_loja;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Loja [id_loja=" + id_loja + ", nome=" + nome + ", endereco=" + endereco + "]";
	}

	public Loja() {
		super();
		// TODO Auto-generated constructor stub
	}

}
