package org.pmm.pruebaspedro.controlador;

import java.util.List;

import org.pmm.pruebaspedro.repositorio.Usuario;
import org.pmm.pruebaspedro.servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", methods = { RequestMethod.GET, RequestMethod.OPTIONS, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RestController
@RequestMapping(value = "/usuarios")
public class Controlador {

	@Autowired
	UsuarioService service;

	@GetMapping(value = "/listar")
	public List<Usuario> listar() {
		return service.listar();
	}
	
	@GetMapping
	public Boolean comprobarAlias(@RequestParam("alias") String aliasUsuario) {
		return service.comprobarAlias(aliasUsuario);
	}

	@PostMapping
	public Usuario agregar(@RequestBody Usuario u) {
		return service.agregar(u);
	}

	@GetMapping(value = "/{idUsuario}")
	public Usuario listaId(@PathVariable("idUsuario") int id) {
		return service.listarId(id);
	}

	@PutMapping(value = "/{idUsuario}")
	public Usuario editar(@RequestBody Usuario u, @PathVariable("idUsuario") int id) {
		u.setIdUsuario(id);
		return service.editar(u);
	}

	@DeleteMapping(value = "/{idUsuario}")
	public @ResponseBody void borrar(@PathVariable("idUsuario") int id) {
		service.delete(id);
	}
}
