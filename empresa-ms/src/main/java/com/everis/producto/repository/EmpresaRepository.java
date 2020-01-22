package com.everis.producto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.producto.entity.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long>{

}
