package org.pmm.pruebaspedro;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_usuario;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String alias_usuario;
	
	@Column
	private String password;
	
	@Column
	private int id_rol;
	
	@Column
	private Date fecha_registro;

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getAlias_usuario() {
		return alias_usuario;
	}

	public void setAlias_usuario(String alias_usuario) {
		this.alias_usuario = alias_usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId_rol() {
		return id_rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
}
