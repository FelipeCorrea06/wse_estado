package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.Estudios;
import co.edu.uniajc.services.wse_estado.repository.EstudiosRepository;

@Service
public class EstudiosService {

	@Autowired
	EstudiosRepository repository;
	
	public Estudios almacenarRegistro(Estudios registro) {
		return repository.save(registro);
	}
	
	public Estudios actualizarRegistro(Estudios registro) {
		return repository.save(registro);
	}
	
	public void eliminarRegistro(int Detalles) {
		repository.deleteById(Detalles);
	}
	
	public List<Estudios> consultarTodos() {
		return repository.findAll();
	}
}
