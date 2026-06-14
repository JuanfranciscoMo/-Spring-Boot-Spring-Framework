package com.bolsadeideas.springboot.error.app.service;

import java.util.List;
import java.util.Optional;

import com.bolsadeideas.springboot.error.app.models.domian.Usuario;

public interface UsuarioService {
	
	public List<Usuario> listar();
	public Usuario obtenerPorId(Integer id);
	public Optional<Usuario> obtenerPorIdOptional(Integer id);
}
