package org.pmm.pruebaspedro;

import java.util.List;

public interface UsuarioService {
	
	List<Usuario>listar();
	Usuario listarId(int id);
	Usuario agregar(Usuario u);
	Usuario editar(Usuario u);
	Usuario borrar(Usuario u);
}
