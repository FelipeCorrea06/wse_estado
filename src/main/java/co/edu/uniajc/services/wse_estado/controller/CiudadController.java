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

import co.edu.uniajc.services.wse_estado.model.Ciudad;
import co.edu.uniajc.services.wse_estado.service.CiudadService;

@RestController
@RequestMapping("/cidudades")
public class CiudadController {

	@Autowired
	private CiudadService productosService;
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
	@PostMapping(path="/guardar")
	public Ciudad insertEstado(@RequestBody Ciudad producto) {
		return productosService.saveProducto(producto);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.PUT})
	@PutMapping(path = "/modificar")
	public Ciudad updateEstado(@RequestBody Ciudad producto) {
		return productosService.updateProducto(producto);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.DELETE})
	@DeleteMapping(path = "/eliminar/{id}")
	public void deleteEstado(@PathVariable("id") int id) {
		productosService.deleteProducto(id);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping(path = "/todos")
	public List<Ciudad> getAllProductos(){
		return productosService.getAllProductos();
	}
}
