package com.webService.Config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.webService.Models.Usuario;
import com.webService.Repository.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfiguration {
	
	
	 
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public void run(String... args) throws Exception {
		
		Usuario u1 = new  Usuario(null, "Joana" , "joana@hotmail.com", "999999999", "123456");
		Usuario u2 = new  Usuario(null, "Maria" , "maria@hotmail.com", "888888888", "123456");
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		
		System.out.print("Teste");
	}
	
	

}
