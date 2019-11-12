package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.Usuario;
import co.edu.uniajc.services.wse_estado.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repository;
	List<Usuario> usuarios;
	
	public Usuario almacenarRegistro(Usuario registro) {
		return repository.save(registro);
	}
	
	public Usuario actualizarRegistro(Usuario registro) {
		return repository.save(registro);
	}
	
	public void eliminarRegistro(int id_usuario) {
		repository.deleteById(id_usuario);
	}
	
	public List<Usuario> consultarTodos() {
		return repository.findAll();
	}
	
	public Usuario consultarPorId(int id) {
		usuarios = repository.findAll();
		for (Usuario user: usuarios) {
			if (user.getId_usuario() == id) {
				return user;
			}
		}
		return null;
	}
	
}
