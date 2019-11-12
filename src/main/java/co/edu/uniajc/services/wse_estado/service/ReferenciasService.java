package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.Referencias;
import co.edu.uniajc.services.wse_estado.repository.ReferenciasRepository;

@Service
public class ReferenciasService {

	@Autowired
	ReferenciasRepository repository;
	List<Referencias> registros;
	
	public Referencias almacenarRegistro(Referencias registro) {
		return repository.save(registro);
	}
	
	public Referencias actualizarRegistro(Referencias registro) {
		return repository.save(registro);
	}
	
	public void eliminarRegistro(int id_cajero) {
		repository.deleteById(id_cajero);
	}
	
	public List<Referencias> consultarTodos() {
		return repository.findAll();
	}
	
	public Referencias consultarPorId(int id) {
		registros = repository.findAll();
		for (Referencias data: registros) {
			if (data.getId() == id) {
				return data;
			}
		}
		return null;
	}
}
