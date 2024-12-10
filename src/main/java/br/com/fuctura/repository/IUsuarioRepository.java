package br.com.fuctura.repository;

import java.util.List;

import br.com.fuctura.entity.Usuario;

public interface IUsuarioRepository {
	
	public List<Usuario> findAll();
	
	public List<Usuario>findAll(int qtdResgistro, int paginas);
	
	public List<Usuario> findUsuariosByIdade(Integer idade);
	
	public void save(Usuario u);
	
	public Integer somarIdade();
}
