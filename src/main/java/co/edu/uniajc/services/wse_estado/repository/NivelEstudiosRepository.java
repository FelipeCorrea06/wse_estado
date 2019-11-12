package co.edu.uniajc.services.wse_estado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uniajc.services.wse_estado.model.NivelEstudios;


@Repository
public interface NivelEstudiosRepository extends JpaRepository<NivelEstudios, Integer>{
	
}
