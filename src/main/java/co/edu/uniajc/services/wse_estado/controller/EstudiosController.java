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

import co.edu.uniajc.services.wse_estado.model.Estudios;
import co.edu.uniajc.services.wse_estado.service.EstudiosService;


@RestController
@RequestMapping("/estudios")
public class EstudiosController {

	@Autowired
	private EstudiosService servicio;

	@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
	@PostMapping(path = "/guardar")
	public Estudios guardarRegistro(@RequestBody Estudios datos) {
	return servicio.almacenarRegistro(datos);
	}

	@CrossOrigin(origins = "*", methods= {RequestMethod.PUT})
	@PutMapping(path = "/modificar")
	public Estudios modificarRegistro(@RequestBody Estudios datos) {
	return servicio.actualizarRegistro(datos);
	}

	@CrossOrigin(origins = "*", methods= {RequestMethod.DELETE})
	@DeleteMapping(path = "/eliminar/{id}")
	public void eliminarRegistro(@PathVariable("id") int id_detalle) {
	servicio.eliminarRegistro(id_detalle);
	}

	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping(path = "/todos")
	public List<Estudios> consultarRegistros() {
	return servicio.consultarTodos();
	}
}
