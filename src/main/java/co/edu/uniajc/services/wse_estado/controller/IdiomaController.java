package co.edu.uniajc.services.wse_estado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniajc.services.wse_estado.model.Idioma;
import co.edu.uniajc.services.wse_estado.service.IdiomaService;

@RestController
@RequestMapping("/idiomas")
public class IdiomaController {

	@Autowired
	private IdiomaService productosService;
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
	@PostMapping(path="/guardar")
	public Idioma insertEstado(@RequestBody Idioma producto) {
		return productosService.saveProducto(producto);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.PUT})
	@PutMapping(path = "/modificar")
	public Idioma updateEstado(@RequestBody Idioma producto) {
		return productosService.updateProducto(producto);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.DELETE})
	@DeleteMapping(path = "/eliminar/{id}")
	public void deleteEstado(@PathVariable("id") int id) {
		productosService.deleteProducto(id);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping(path = "/todos")
	public List<Idioma> getAllProductos(){
		return productosService.getAllProductos();
	}
}
