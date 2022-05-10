package com.colombiaTour.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colombiaTour.models.entity.CentroComercial;

@Repository
public interface CentroCRepository extends CrudRepository<CentroComercial, Integer>{

}
