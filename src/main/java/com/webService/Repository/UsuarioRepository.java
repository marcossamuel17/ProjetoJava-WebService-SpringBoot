package com.webService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webService.Models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
