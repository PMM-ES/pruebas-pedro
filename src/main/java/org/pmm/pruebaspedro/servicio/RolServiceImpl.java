package org.pmm.pruebaspedro.servicio;

import java.util.List;

import org.pmm.pruebaspedro.repositorio.Rol;
import org.pmm.pruebaspedro.repositorio.RolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolServiceImpl implements RolService {

	@Autowired
	private RolRepositorio RolRepo;
	
	@Override
	public List<Rol> listar() {
		return RolRepo.findAll();
	}

	@Override
	public Rol agregar(Rol r) {
		return RolRepo.save(r);
	}

	@Override
	public Rol listarId(int idRol) {
		return RolRepo.findById(idRol);
	}

	@Override
	public Rol editar(Rol r) {
		return RolRepo.save(r);
	}

	@Override
	public Rol delete(int id) {
		Rol r = RolRepo.findById(id);
		if (r != null) {
			RolRepo.delete(r);
		}
		return r;
	}
}
