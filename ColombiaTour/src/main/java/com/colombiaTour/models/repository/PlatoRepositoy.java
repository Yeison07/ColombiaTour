package com.colombiaTour.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colombiaTour.models.entity.Plato;

@Repository
public interface PlatoRepositoy extends CrudRepository<Plato, Integer>{

}
