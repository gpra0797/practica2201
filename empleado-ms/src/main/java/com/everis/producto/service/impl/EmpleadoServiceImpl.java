package com.everis.producto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everis.producto.entity.Empleado;
import com.everis.producto.exceptions.ResourceNotFoundException;
import com.everis.producto.repository.EmpleadoRepository;
import com.everis.producto.service.EmpleadoService;

@Transactional(readOnly = true)
@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	private EmpleadoRepository EmpleadoRepository;
	
	
	@Override
	public Empleado obtenerEmpleadoXId(Long id) throws ResourceNotFoundException {
		
		return EmpleadoRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(String.format("no se encontró el Empleado con el id %s", id)));
	}

}
