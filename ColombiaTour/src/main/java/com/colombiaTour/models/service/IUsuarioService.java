package com.colombiaTour.models.service;

import java.util.List;

import com.colombiaTour.models.entity.Usuario;


public interface IUsuarioService {

	public List<Usuario> findAll();
	public void insertar(Usuario usuario);
	public Usuario findUsuario(Integer user);
	public void delete(Integer user);
	public Usuario findByUser(String user);
}
