package org.pmm.pruebaspedro.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface RolRepositorio extends Repository<Usuario, Integer> {
	
	List<Usuario> findAll();

	Usuario save(Usuario u);

	Usuario findById(int idUsuario);

	void delete(Usuario u);
	
	//@Query("SELECT t FROM Usuario t WHERE t.alias_usuario = ?1")
	List<Usuario> findByAliasUsuarioEquals(String aliasUsuario);
}
