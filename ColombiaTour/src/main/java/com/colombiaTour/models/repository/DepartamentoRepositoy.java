package com.colombiaTour.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colombiaTour.models.entity.Departamento;

@Repository
public interface DepartamentoRepositoy extends CrudRepository<Departamento, Integer>{

}
