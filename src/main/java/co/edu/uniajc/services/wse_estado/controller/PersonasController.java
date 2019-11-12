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
import co.edu.uniajc.services.wse_estado.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonasController {

	@Autowired
	private PersonaService bancosService;
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
	@PostMapping(path="/guardar")
	public Persona insertEstado(@RequestBody Persona estado) {
		return bancosService.saveBanco(estado);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.PUT})
	@PutMapping(path = "/modificar")
	public Persona updateEstado(@RequestBody Persona estado) {
		return bancosService.updateBanco(estado);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.DELETE})
	@DeleteMapping(path = "/eliminar/{id}")
	public void deleteEstado(@PathVariable("id") int id) {
		bancosService.deleteBanco(id);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping(path = "/todos")
	public List<Persona> getAllEstados(){
		return bancosService.getAllBancos();
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping(path = "/{id}")
	public Persona consultarEstadoporId(@PathVariable("id") int id_persona) {
		return bancosService.consultarPorId(id_persona);
	}
	
}
