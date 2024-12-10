package br.com.fuctura.service;


import br.com.fuctura.repository.IUsuarioRepository;

public class UsuarioService {

	private final IUsuarioRepository usuarioRepository;
	
	public UsuarioService (IUsuarioRepository usarioRepository) {
		this.usuarioRepository = usarioRepository;
	}
	
	/*
	 * public void salvarUsuario(CadastrarUsuarioRepository usuarioDto) { Usuario
	 * entity = new converterParaEntity(usuarioDto);
	 * 
	 * 
	 * }
	 * 
	 * public UsuarioEntity converterParaEntity(UsuarioEntity entity) { return new
	 * ListarUsuarioResponse(entity.getNome(), entity.getIdade(),
	 * entity.getPerfis().get(0).getNome(), entity.getPerfis().get(0).getTema() ); }
	 */
}
