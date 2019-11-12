package co.edu.uniajc.services.wse_estado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.Experiencia;
import co.edu.uniajc.services.wse_estado.repository.ExperienciaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienciaService {
	
	@Autowired
	ExperienciaRepository estadoRepository;
	List<Experiencia> estados;
	Experiencia estado;
	
	public Experiencia almacenarRegistro(Experiencia estado) {
		return estadoRepository.save(estado);
	}
	
	public Experiencia actualizarRegistro(Experiencia estado) {
		return estadoRepository.save(estado);
	}
	
	public void eliminarRegistro(int estado_id) {
		estadoRepository.deleteById(estado_id);
	}
	
	public List<Experiencia> consultarTodos() {
		return estadoRepository.findAll();
	}
	
	public Experiencia consultarPorId(int id) {
		estados = estadoRepository.findAll();
		for (Experiencia state: estados) {
			if (state.getId() == id) {
				return state;
			}
		}
		return null;
	}
	
}
