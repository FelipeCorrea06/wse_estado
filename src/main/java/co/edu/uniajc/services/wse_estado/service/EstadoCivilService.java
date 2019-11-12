package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.EstadoCivil;
import co.edu.uniajc.services.wse_estado.repository.EstadoCivilRepository;


@Service
public class EstadoCivilService {
	@Autowired
	EstadoCivilRepository repository;
	List<EstadoCivil> registros;
	
	public EstadoCivil almacenarRegistro(EstadoCivil registro) {
		return repository.save(registro);
	}
	
	public EstadoCivil actualizarRegistro(EstadoCivil registro) {
		return repository.save(registro);
	}
	
	public void eliminarRegistro(int id_cuenta) {
		repository.deleteById(id_cuenta);
	}
	
	public List<EstadoCivil> consultarTodos() {
		return repository.findAll();
	}
	
	public EstadoCivil consultarPorId(int id) {
		registros = repository.findAll();
		for (EstadoCivil data: registros) {
			if (data.getId() == id) {
				return data;
			}
		}
		return null;
	}
	
}
