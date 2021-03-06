package com.usuarios.apirest.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usuarios.apirest.models.Usuario;
import com.usuarios.apirest.repository.UsuarioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Usuarios")
public class UsuarioResource {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@ApiOperation(value="Retorna uma lista de Usuarios")
	@GetMapping("/usuarios")
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um usuario unico")
	@GetMapping("/usuario/{id}")
	public Usuario listaUsuarioUnico(@PathVariable(value="id") long id){
		return usuarioRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um usuario")
	@PostMapping("/usuario")
	public Usuario salvaUsuario(@RequestBody @Valid Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@ApiOperation(value="Deleta um usuario")
	@DeleteMapping("/usuario")
	public void deletaUsuario(@RequestBody @Valid Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
	
	@ApiOperation(value="Atualiza um usuario")
	@PutMapping("/usuario")
	public Usuario atualizaUsuario(@RequestBody @Valid Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	 

}
