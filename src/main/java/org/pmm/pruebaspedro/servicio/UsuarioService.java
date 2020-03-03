package org.pmm.pruebaspedro.servicio;

import java.util.List;

import org.pmm.pruebaspedro.repositorio.Usuario;

public interface UsuarioService {
	List<Usuario>listar();
	Usuario agregar(Usuario u);
	Usuario listarId(int idUsuario);
	Usuario editar(Usuario u);
	Usuario delete(int id);
	Boolean comprobarAlias(String aliasUsuario);
}
