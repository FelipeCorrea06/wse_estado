package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.Barrios;
import co.edu.uniajc.services.wse_estado.repository.BarriosRepository;

@Service
public class BarriosService {

	@Autowired
	BarriosRepository productosRepository;
	
	public Barrios saveProducto(Barrios producto) {
		return productosRepository.save(producto);
	}
	
	public Barrios updateProducto(Barrios producto) {
		return productosRepository.save(producto);
	}
	
	public void deleteProducto(int id) {
		productosRepository.deleteById(id);
	}
	
	public List<Barrios> getAllProductos(){
		return productosRepository.findAll();
	}
}
