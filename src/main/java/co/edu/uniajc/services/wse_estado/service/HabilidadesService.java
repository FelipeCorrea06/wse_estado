package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.Habilidades;
import co.edu.uniajc.services.wse_estado.repository.HabilidadesRepository;

@Service
public class HabilidadesService {

	@Autowired
	HabilidadesRepository productosRepository;
	
	public Habilidades saveProducto(Habilidades producto) {
		return productosRepository.save(producto);
	}
	
	public Habilidades updateProducto(Habilidades producto) {
		return productosRepository.save(producto);
	}
	
	public void deleteProducto(int id) {
		productosRepository.deleteById(id);
	}
	
	public List<Habilidades> getAllProductos(){
		return productosRepository.findAll();
	}
}
