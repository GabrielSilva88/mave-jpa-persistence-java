package br.com.fuctura.entity;

public class Venda {

	private int id_venda;
	private String produto;
	private double valor;
	public int getId_venda() {
		return id_venda;
	}
	public void setId_venda(int id_venda) {
		this.id_venda = id_venda;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Venda [id_venda=" + id_venda + ", produto=" + produto + ", valor=" + valor + "]";
	}
	
	public Venda() {
		super();
	}
	
	
}
