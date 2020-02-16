package org.pmm.pruebaspedro;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface UsuarioRepositorio extends Repository<Usuario, Integer> {
	
	List<Usuario> findAll();
/*	Usuario findOne(int id_usuario);
	Usuario save(Usuario u);
	Usuario edit(Usuario u);
	void delete(Usuario u);
	*/
}
