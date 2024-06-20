package com.example.demo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="socio")
public class EntidadSocio {
	@Id
	@Column(length =36)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	 private Long id;
	@Column(length =10)
	 private String nombre;
	@Column(length =20)
	 private String apellido;
	@Column(length =10)
	 private String ciudad;
	
	 private Date fecha;
	@Column(length =36)
	 private String correo;
	@Column(length =36)
	 private String contrasena;
	@Column(length =10)
	 private String telefono;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public EntidadSocio(Long id, String nombre, String apellido, String ciudad, Date fecha, String correo,
			String contrasena, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
		this.fecha = fecha;
		this.correo = correo;
		this.contrasena = contrasena;
		this.telefono = telefono;
	}
	public EntidadSocio() {
		
	}
	 

}
