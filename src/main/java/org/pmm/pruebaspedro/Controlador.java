package org.pmm.pruebaspedro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200", allowedHeaders = "*", maxAge=3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RestController
@RequestMapping({"/usuarios"})
public class Controlador {
	
	@Autowired
	UsuarioService service;
	
	@GetMapping
	public List<Usuario> listar(){	
		return service.listar();
	}
	
	@PostMapping
	public Usuario agregar(@RequestBody Usuario u){	
		return service.agregar(u);
	}
	
	@RequestMapping("/{id_usuario}")
	public Usuario lista(@PathVariable("id_usuario") int id){	
		return service.listarId(id);
	}
	
	@PutMapping(params = "/{id_usuario}")
	public Usuario editar(@RequestBody Usuario u, @PathVariable("id_usuario") int id){
		u.setId_usuario(id);
		return service.editar(u);
	}
}
