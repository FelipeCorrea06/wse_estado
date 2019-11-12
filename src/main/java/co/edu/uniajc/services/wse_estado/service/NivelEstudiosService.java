package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.NivelEstudios;
import co.edu.uniajc.services.wse_estado.repository.NivelEstudiosRepository;

@Service
public class NivelEstudiosService {
	
	@Autowired
	NivelEstudiosRepository movimientoRepository;
	
	public NivelEstudios almacenarRegistro(NivelEstudios registro) {
		return movimientoRepository.save(registro);
	}
	
	public NivelEstudios actualizarRegistro(NivelEstudios registro) {
		return movimientoRepository.save(registro);
	}
	
	public void eliminarRegistro(int id_movimiento) {
		movimientoRepository.deleteById(id_movimiento);
	}
	
	public List<NivelEstudios> consultarTodos() {
		return movimientoRepository.findAll();
	}
	
	
}
