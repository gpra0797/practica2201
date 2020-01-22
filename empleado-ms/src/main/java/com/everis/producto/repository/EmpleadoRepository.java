package com.everis.producto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.producto.entity.Empleado;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Long>{

}
