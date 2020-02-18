package org.pmm.pruebaspedro;

import java.util.List;

public interface UsuarioService {
	List<Usuario>listar();
	Usuario agregar(Usuario u);
	Usuario listarId(int id_usuario);
	Usuario editar(Usuario u);
	Usuario delete(int id);
}
