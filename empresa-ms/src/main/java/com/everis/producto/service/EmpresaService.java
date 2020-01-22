package com.everis.producto.service;

import com.everis.producto.entity.Empresa;
import com.everis.producto.exceptions.ResourceNotFoundException;

public interface EmpresaService {
	
	
	public Empresa obtenerEmpresaXId(Long id) throws ResourceNotFoundException;
}
