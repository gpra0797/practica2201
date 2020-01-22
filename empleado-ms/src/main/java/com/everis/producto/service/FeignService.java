package com.everis.producto.service;


import com.everis.producto.dto.EmpresaDTO;
import com.everis.producto.exceptions.ResourceNotFoundException;
import com.everis.producto.exceptions.ValidationException;

public interface FeignService {
	
	public EmpresaDTO obtenerEmpresaXId(Long id) throws ValidationException, ResourceNotFoundException;

}
