package org.pmm.pruebaspedro.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface RolRepositorio extends Repository<Rol, Integer> {
	
	List<Rol> findAll();

	Rol save(Rol r);

	Rol findById(int idRol);

	void delete(Rol r);
	
}
