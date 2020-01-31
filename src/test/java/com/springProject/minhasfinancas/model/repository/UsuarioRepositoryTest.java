package com.springProject.minhasfinancas.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.springProject.minhasfinancas.model.entity.Usuario;

@SpringBootTest
@ExtendWith( SpringExtension.class )
@ActiveProfiles("test")
public class UsuarioRepositoryTest {
	
	@Autowired
	UsuarioRepository repository;
	@Test
	public void deveVerificarExistenciaEmail() {
		Usuario usuario = Usuario.builder().nome("Usuario").email("usuario@email.com").build();
		repository.save(usuario);
	
		
	boolean resultado =	repository.existsByEmail("usuario@email.com");
	
	Assertions.assertThat(resultado).isTrue();
	}
}
