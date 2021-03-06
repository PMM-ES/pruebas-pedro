package org.pmm.pruebaspedro.servicio;

import java.util.Date;
import java.util.List;

import org.pmm.pruebaspedro.repositorio.RolRepositorio;
import org.pmm.pruebaspedro.repositorio.Usuario;
import org.pmm.pruebaspedro.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepositorio usuarioRepo;
	
	@Autowired
	private RolRepositorio rolRepo;
	
	@Override
	public List<Usuario> listar() {
		return usuarioRepo.findAll();
	}

	@Override
	public Usuario agregar(Usuario u) {
		u.setRol(rolRepo.findById(2));
		u.setFechaRegistro(new Date());
		return usuarioRepo.save(u);
	}

	@Override
	public Usuario listarId(int idUsuario) {
		return usuarioRepo.findById(idUsuario);
	}

	@Override
	public Usuario editar(Usuario u) {
		return usuarioRepo.save(u);
	}

	@Override
	public Usuario delete(int id) {
		Usuario u = usuarioRepo.findById(id);
		if (u != null) {
			usuarioRepo.delete(u);
		}
		return u;
	}

	@Override
	public Boolean comprobarAlias(String aliasUsuario) {
		return usuarioRepo.findByAliasUsuarioEquals(aliasUsuario).size() > 0 ? true : false;
	}
}
