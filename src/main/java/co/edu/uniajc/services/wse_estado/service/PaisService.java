package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.Pais;
import co.edu.uniajc.services.wse_estado.repository.PaisRepository;

@Service
public class PaisService {

	@Autowired
	PaisRepository productosRepository;
	
	public Pais saveProducto(Pais producto) {
		return productosRepository.save(producto);
	}
	
	public Pais updateProducto(Pais producto) {
		return productosRepository.save(producto);
	}
	
	public void deleteProducto(int id) {
		productosRepository.deleteById(id);
	}
	
	public List<Pais> getAllProductos(){
		return productosRepository.findAll();
	}
}
