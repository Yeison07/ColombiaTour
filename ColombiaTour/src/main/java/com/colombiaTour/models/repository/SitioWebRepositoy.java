package com.colombiaTour.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colombiaTour.models.entity.SitioWeb;

@Repository
public interface SitioWebRepositoy extends CrudRepository<SitioWeb, Integer>{

}
