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

import co.edu.uniajc.services.wse_estado.model.Persona;
import co.edu.uniajc.services.wse_estado.model.EstadoCivil;
import co.edu.uniajc.services.wse_estado.service.EstadoCivilService;



@RestController
@RequestMapping("/estadosciviles")
public class EstadoCivilController {
	@Autowired
	private EstadoCivilService servicio;
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
	@PostMapping(path = "/guardar")
	public EstadoCivil guardarRegistro(@RequestBody EstadoCivil datos) {
	return servicio.almacenarRegistro(datos);
	}

	@CrossOrigin(origins = "*", methods= {RequestMethod.PUT})
	@PutMapping(path = "/modificar")
	public EstadoCivil modificarRegistro(@RequestBody EstadoCivil datos) {
	return servicio.actualizarRegistro(datos);
	}

	@CrossOrigin(origins = "*", methods= {RequestMethod.DELETE})
	@DeleteMapping(path = "/eliminar/{id}")
	public void eliminarRegistro(@PathVariable("id") int id_cuenta) {
	servicio.eliminarRegistro(id_cuenta);
	}

	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping(path = "/todos")
	public List<EstadoCivil> consultarRegistros() {
	return servicio.consultarTodos();
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping(path = "/{id}")
	public EstadoCivil consultarEstadoporId(@PathVariable("id") int id) {
		return servicio.consultarPorId(id);
	}
}
