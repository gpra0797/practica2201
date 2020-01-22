package com.everis.producto.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.producto.dto.EmpresaDTO;
import com.everis.producto.exceptions.ResourceNotFoundException;
import com.everis.producto.exceptions.ValidationException;
import com.everis.producto.repository.feign.EmpresaClient;
import com.everis.producto.service.FeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class FeignClientServiceImpl implements FeignService{

	@Autowired
	private EmpresaClient clientOne;
	
	@HystrixCommand(fallbackMethod = "obtenerEmpresaPorDefecto")
	@Override
	public EmpresaDTO obtenerEmpresaXId(Long id) throws ValidationException, ResourceNotFoundException {
		return clientOne.obtenerEmpresaXId(id);
	}
	
	public EmpresaDTO obtenerEmpresaPorDefecto(Long id) throws ValidationException, ResourceNotFoundException {
		// TODO Auto-generated method stub
		EmpresaDTO dto = new EmpresaDTO();
		dto.setNombre("EMPRESA VACIA");
		return dto;
	}

}
