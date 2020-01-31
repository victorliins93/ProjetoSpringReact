package com.springProject.minhasfinancas.model.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.springProject.minhasfinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	boolean existsByEmail(String email);
	
	
}
