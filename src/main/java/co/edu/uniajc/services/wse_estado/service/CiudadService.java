package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.Ciudad;
import co.edu.uniajc.services.wse_estado.repository.CiudadRepository;

@Service
public class CiudadService {

	@Autowired
	CiudadRepository productosRepository;
	
	public Ciudad saveProducto(Ciudad producto) {
		return productosRepository.save(producto);
	}
	
	public Ciudad updateProducto(Ciudad producto) {
		return productosRepository.save(producto);
	}
	
	public void deleteProducto(int id) {
		productosRepository.deleteById(id);
	}
	
	public List<Ciudad> getAllProductos(){
		return productosRepository.findAll();
	}
}
