package com.everis.producto.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="empleado")
public class Empleado {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	
	private String apellidoPaterno;
	
	
	private String apellidoMaterno;
	
	private String dni;
	
	private Date fechaIngreso;
	
	private Boolean activo;
	
	
	private Long idEmpresa;
	
	
}

