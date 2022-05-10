package com.colombiaTour.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colombiaTour.models.entity.Clima;
@Repository
public interface ClimaRepositoy extends CrudRepository<Clima, Integer>{

}
