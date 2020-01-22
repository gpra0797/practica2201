package com.everis.producto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everis.producto.entity.Empresa;
import com.everis.producto.exceptions.ResourceNotFoundException;
import com.everis.producto.repository.EmpresaRepository;
import com.everis.producto.service.EmpresaService;

@Transactional(readOnly = true)
@Service
public class EmpresaServiceImpl implements EmpresaService{
	
	@Autowired
	private EmpresaRepository EmpresaRepository;
	
	
	@Override
	public Empresa obtenerEmpresaXId(Long id) throws ResourceNotFoundException {
		
		return EmpresaRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(String.format("no se encontró el Empresa con el id %s", id)));
	}

}
