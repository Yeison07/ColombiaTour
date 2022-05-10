package com.colombiaTour.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colombiaTour.models.entity.Usuario;


@Repository
public interface UsuarioRepositoy extends CrudRepository<Usuario, Integer>{

	public Usuario findByUser(String user);


}
