package com.panweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empleados {
    
	@Id
	private int Idempleado; 
	
	@Column(name="nombres",length = 50)
	private String nombres;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "identificacion")
	private String identificacion;
	
	@Column(name="cargo")
	private String cargo;
	

	public int getIdempleado() {
		return Idempleado;
	}

	public void setIdempleado(int idempleado) {
		Idempleado = idempleado;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
