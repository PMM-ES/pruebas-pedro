package org.pmm.pruebaspedro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhsot:4200",maxAge=3600)
@RestController
@RequestMapping({"/usuarios"})
public class Controlador {
	
	@Autowired
	UsuarioService service;
	
	@GetMapping
	public List<Usuario> listar(){	
		return service.listar();
	}
	/*
	@GetMapping
	public Usuario lista(int id){	
		return service.listarId(id);
	}
	
	@PostMapping
	public Usuario agregar(Usuario u){	
		return service.agregar(u);
	}
	
	@PostMapping
	public Usuario editar(Usuario u){	
		return service.editar(u);
	}
	
	@PostMapping
	public Usuario borrar(Usuario u){	
		return service.borrar(u);
	}
*/
}
