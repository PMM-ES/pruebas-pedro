package org.pmm.pruebaspedro;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface UsuarioRepositorio extends Repository<Usuario, Integer> {
	List<Usuario> findAll();
	Usuario save(Usuario u);
	Usuario getOne(int id_usuario);
}
