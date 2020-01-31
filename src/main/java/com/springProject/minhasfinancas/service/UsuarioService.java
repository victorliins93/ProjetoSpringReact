package com.springProject.minhasfinancas.service;

import com.springProject.minhasfinancas.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticarUsuario(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String email);
	
}
