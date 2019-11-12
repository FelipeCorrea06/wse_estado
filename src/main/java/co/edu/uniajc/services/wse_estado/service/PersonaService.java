package co.edu.uniajc.services.wse_estado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import co.edu.uniajc.services.wse_estado.model.Persona;
import co.edu.uniajc.services.wse_estado.repository.BancosRepository;

@Service
public class PersonaService {

	@Autowired
	BancosRepository bancosRepository;
	List<Persona> registros;
	
	public Persona saveBanco(Persona banco) {
		return bancosRepository.save(banco);
	}
	
	public Persona updateBanco(Persona banco) {
		return bancosRepository.save(banco);
	}
	
	public void deleteBanco(int id) {
		bancosRepository.deleteById(id);
	}
	
	public List<Persona> getAllBancos(){
		return bancosRepository.findAll();
	}
	
	public Persona consultarPorId(int id) {
		registros = bancosRepository.findAll();
		for (Persona data: registros) {
			if (data.getId() == id) {
				return data;
			}
		}
		return null;
	}
}
