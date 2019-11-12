package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.TipoIdentificacion;
import co.edu.uniajc.services.wse_estado.repository.TipoIdentificacionRepository;

@Service
public class TipoIdentificacionService {
	
	@Autowired
	TipoIdentificacionRepository repository;
	
	public TipoIdentificacion almacenarRegistro(TipoIdentificacion registro) {
		return repository.save(registro);
	}
	
	public TipoIdentificacion actualizarRegistro(TipoIdentificacion registro) {
		return repository.save(registro);
	}
	
	public void eliminarRegistro(int id_tipo_identificacion) {
		repository.deleteById(id_tipo_identificacion);
	}
	
	public List<TipoIdentificacion> consultarTodos() {
		return repository.findAll();
	}
}
