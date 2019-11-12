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

import co.edu.uniajc.services.wse_estado.model.NivelEstudios;
import co.edu.uniajc.services.wse_estado.service.NivelEstudiosService;

@RestController
@RequestMapping(value="/niveles")
public class NivelEstudiosController {

	@Autowired
	private NivelEstudiosService movService;
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
	@PostMapping(path = "/guardar")
	public NivelEstudios guardarRegistro(@RequestBody NivelEstudios datos) {
		return movService.almacenarRegistro(datos);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.PUT})
	@PutMapping(path = "/modificar")
	public NivelEstudios modificarRegistro(@RequestBody NivelEstudios datos) {
		return movService.actualizarRegistro(datos);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.DELETE})
	@DeleteMapping(path = "/eliminar/{id}")
	public void eliminarRegistro(@PathVariable("id") int id_movimiento) {
		movService.eliminarRegistro(id_movimiento);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping(path = "/todos")
	//@RequestMapping(value="/todos", method=RequestMethod.GET)
	public List<NivelEstudios> consultarRegistros() {
		return movService.consultarTodos();
	}
}
