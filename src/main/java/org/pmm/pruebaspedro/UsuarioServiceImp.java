package org.pmm.pruebaspedro;

import java.util.Date;
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
	public Usuario agregar(Usuario u) {	
		u.setId_rol(2);
		u.setFecha_registro(new Date());
		return usuarioRepo.save(u);
	}

	@Override
	public Usuario listarId(int id_usuario) {	
		return usuarioRepo.getOne(id_usuario);
	}

	@Override
	public Usuario editar(Usuario u) {		
		return usuarioRepo.save(u);
	}
}
