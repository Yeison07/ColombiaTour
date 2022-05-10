package com.colombiaTour.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colombiaTour.models.entity.Gastronomia;

@Repository
public interface GastronomiaRepositoy extends CrudRepository<Gastronomia, Integer>{

}
