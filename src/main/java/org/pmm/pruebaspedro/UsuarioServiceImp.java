package org.pmm.pruebaspedro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService {

	@Autowired
	private UsuarioRepositorio usuarioRepo;
	
	@Override
	public List<Usuario> listar() {
		return usuarioRepo.findAll();
	}

	@Override
	public Usuario listarId(int id) {	
		return usuarioRepo.findOne(id);
	}

	@Override
	public Usuario agregar(Usuario u) {		
		return usuarioRepo.save(u);
	}

	@Override
	public Usuario editar(Usuario u) {		
		return usuarioRepo.edit(u);
	}

	@Override
	public Usuario borrar(Usuario u) {	
		usuarioRepo.delete(u);
		return u;
	}
	
}
