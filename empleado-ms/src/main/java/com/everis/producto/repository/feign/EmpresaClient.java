package com.everis.producto.repository.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.everis.producto.dto.EmpresaDTO;
import com.everis.producto.exceptions.ResourceNotFoundException;
import com.everis.producto.exceptions.ValidationException;

@FeignClient("empresa-ms")
public interface EmpresaClient {

	
	@GetMapping(value = "/Empresas/{id}")
	public EmpresaDTO obtenerEmpresaXId(
			@PathVariable("id") Long id
			) throws ValidationException, ResourceNotFoundException;
	
}
