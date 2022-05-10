package com.colombiaTour.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colombiaTour.models.entity.Corregimiento;

@Repository
public interface CorregimientoRepositoy extends CrudRepository<Corregimiento, Integer>{

}
