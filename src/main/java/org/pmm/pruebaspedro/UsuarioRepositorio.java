package org.pmm.pruebaspedro;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface UsuarioRepositorio extends Repository<Usuario, Integer> {
	List<Usuario> findAll();
	Usuario save(Usuario u);
	Usuario findById(int id_usuario);
	void delete(Usuario u);
}
