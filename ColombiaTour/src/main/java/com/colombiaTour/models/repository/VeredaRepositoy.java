package com.colombiaTour.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colombiaTour.models.entity.Vereda;

@Repository
public interface VeredaRepositoy extends CrudRepository<Vereda, Integer>{

}
