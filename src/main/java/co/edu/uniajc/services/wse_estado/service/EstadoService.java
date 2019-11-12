package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.Idioma;
import co.edu.uniajc.services.wse_estado.repository.IdiomaRepository;

@Service
public class EstadoService {

	@Autowired
	IdiomaRepository productosRepository;
	
	public Idioma saveProducto(Idioma producto) {
		return productosRepository.save(producto);
	}
	
	public Idioma updateProducto(Idioma producto) {
		return productosRepository.save(producto);
	}
	
	public void deleteProducto(int id) {
		productosRepository.deleteById(id);
	}
	
	public List<Idioma> getAllProductos(){
		return productosRepository.findAll();
	}
}
