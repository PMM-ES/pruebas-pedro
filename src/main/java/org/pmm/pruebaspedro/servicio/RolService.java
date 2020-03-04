package org.pmm.pruebaspedro.servicio;

import java.util.List;

import org.pmm.pruebaspedro.repositorio.Rol;

public interface RolService {
	
	List<Rol> listar();

	Rol agregar(Rol r);

	Rol listarId(int idRol);

	Rol editar(Rol r);

	Rol delete(int id);
}
