package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.Publicada;
import co.edu.uniajc.services.wse_estado.model.Usuario;
import co.edu.uniajc.services.wse_estado.repository.PublicadaRepository;

@Service
public class PublicadaService {

	@Autowired
	PublicadaRepository repository;
	List<Publicada> registros;
	
	public Publicada almacenarRegistro(Publicada registro) {
		return repository.save(registro);
	}
	
	public Publicada actualizarRegistro(Publicada registro) {
		return repository.save(registro);
	}
	
	public void eliminarRegistro(int id_publicada) {
		repository.deleteById(id_publicada);
	}
	
	public List<Publicada> consultarTodos() {
		return repository.findAll();
	}
	
	public Publicada consultarPorId(int id) {
		registros = repository.findAll();
		for (Publicada data: registros) {
			if (data.getId() == id) {
				return data;
			}
		}
		return null;
	}
}
