package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.Estado;
import co.edu.uniajc.services.wse_estado.repository.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	EstadoRepository productosRepository;
	
	public Estado saveProducto(Estado producto) {
		return productosRepository.save(producto);
	}
	
	public Estado updateProducto(Estado producto) {
		return productosRepository.save(producto);
	}
	
	public void deleteProducto(int id) {
		productosRepository.deleteById(id);
	}
	
	public List<Estado> getAllProductos(){
		return productosRepository.findAll();
	}
}
