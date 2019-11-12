package co.edu.uniajc.services.wse_estado.controller;

import java.util.List;

import javax.websocket.server.PathParam;

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

import co.edu.uniajc.services.wse_estado.model.Experiencia;
import co.edu.uniajc.services.wse_estado.service.ExperienciaService;

@RestController
@RequestMapping(value="/experiencia")
public class ExperienciaController {
	
	@Autowired
	private ExperienciaService estadoService;
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
	@PostMapping(path = "/guardar")
	public Experiencia guardarEstado(@RequestBody Experiencia estado) {
		return estadoService.almacenarRegistro(estado);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.PUT})
	@PutMapping(path = "/modificar")
	public Experiencia modificarEstado(@RequestBody Experiencia estado) {
		return estadoService.actualizarRegistro(estado);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.DELETE})
	@DeleteMapping(path = "/eliminar/{id}")
	public void eliminarEstado(@PathVariable("id") int estado_id) {
		estadoService.eliminarRegistro(estado_id);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping(path = "/todos")
	//@RequestMapping(value="/todos", method=RequestMethod.GET)
	public List<Experiencia> consultarEstados() {
		return estadoService.consultarTodos();
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping(path = "/{id}")
	public Experiencia consultarEstadoporId(@PathVariable("id") int estado_id) {
		return estadoService.consultarPorId(estado_id);
	}
	
	
}
