package com.webService.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webService.Models.Usuario;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario user = new Usuario(2L, "Maria", "maria@hotmail.com", "989898989", "1234");
		return ResponseEntity.ok().body(user);
	}
	
	

}
