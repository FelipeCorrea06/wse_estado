package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.Profesiones;
import co.edu.uniajc.services.wse_estado.repository.ProfesionesRepository;

@Service
public class ProfesionesService {

	@Autowired
	ProfesionesRepository repository;
	List<Profesiones> registros;
	
	public Profesiones almacenarRegistro(Profesiones registro) {
		return repository.save(registro);
	}
	
	public Profesiones actualizarRegistro(Profesiones registro) {
		return repository.save(registro);
	}
	
	public void eliminarRegistro(int id_profesion) {
		repository.deleteById(id_profesion);
	}
	
	public List<Profesiones> consultarTodos() {
		return repository.findAll();
	}
	
	public Profesiones consultarPorId(int id) {
		registros = repository.findAll();
		for (Profesiones data: registros) {
			if (data.getId() == id) {
				return data;
			}
		}
		return null;
	}
}
