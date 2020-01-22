package com.everis.producto.controlador;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.everis.producto.dto.EmpleadoDTO;
import com.everis.producto.entity.Empleado;
import com.everis.producto.exceptions.ResourceNotFoundException;
import com.everis.producto.exceptions.ValidationException;
import com.everis.producto.service.impl.EmpleadoServiceImpl;
import com.everis.producto.service.impl.FeignClientServiceImpl;

@RestController
@RefreshScope
public class EmpleadoControlador {
	
	@Autowired
	private EmpleadoServiceImpl EmpleadoService;
	
	
	
	@Value("${igv}")
	private String igv;
	
	
	
	@Autowired
	private FeignClientServiceImpl feignClientOne;
	
	
	
	@GetMapping(value = "/Empleados/{id}")
	public EmpleadoDTO obtenerEmpleadoXId(
			@PathVariable("id") Long id
			) throws ResourceNotFoundException, ValidationException{
		
		ModelMapper mapper = new ModelMapper();
		Empleado empleado = EmpleadoService.obtenerEmpleadoXId(id);
		EmpleadoDTO dto =  mapper.map(empleado, EmpleadoDTO.class);
		
		dto.setEmpresa(feignClientOne.obtenerEmpresaXId(empleado.getId()).getNombre());
		return dto;
	}
	
	
	
}
