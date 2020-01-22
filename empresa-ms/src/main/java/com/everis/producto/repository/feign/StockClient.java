package com.everis.producto.repository.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("almacen-ms")
public interface StockClient {

	
//	@GetMapping(value = "/cantidad/acumulado/producto/{idProducto}")
//	public CantidadDTO obtenerCantidadXProducto(
//			@PathVariable("idProducto") Long idProducto
//			) throws ValidationException, ResourceNotFoundException;
	
}
