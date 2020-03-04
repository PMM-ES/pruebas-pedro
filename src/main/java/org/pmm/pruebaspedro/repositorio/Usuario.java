package org.pmm.pruebaspedro.repositorio;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "alias_usuario")
	private String aliasUsuario;

	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;

	@Column(name = "fecha_registro")
	private Date fechaRegistro;

	@ManyToOne
	@JoinColumn(name = "id_rol")
	private Rol rol;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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

	public String getAliasUsuario() {
		return aliasUsuario;
	}

	public void setAliasUsuario(String aliasUsuario) {
		this.aliasUsuario = aliasUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
}
