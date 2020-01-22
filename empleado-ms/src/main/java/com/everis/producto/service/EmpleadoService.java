package com.everis.producto.service;

import com.everis.producto.entity.Empleado;
import com.everis.producto.exceptions.ResourceNotFoundException;

public interface EmpleadoService {
	
	
	public Empleado obtenerEmpleadoXId(Long id) throws ResourceNotFoundException;
}
