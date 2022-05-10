package com.colombiaTour.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.colombiaTour.models.entity.Usuario;
import com.colombiaTour.models.repository.UsuarioRepositoy;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private UsuarioRepositoy ur;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>)ur.findAll();
	}

	@Override
	public void insertar(Usuario usuario) {
		// TODO Auto-generated method stub
		usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
		ur.save(usuario);

	}

	@Override
	public Usuario findUsuario(Integer user) {
		// TODO Auto-generated method stub
		return ur.findById(user).orElse(null);
	}

	@Override
	public void delete(Integer user) {
		// TODO Auto-generated method stub
		ur.deleteById(user);

	}

	@Override
	public Usuario findByUser(String user) {
		// TODO Auto-generated method stub
		return ur.findByUser(user);
	}

}
