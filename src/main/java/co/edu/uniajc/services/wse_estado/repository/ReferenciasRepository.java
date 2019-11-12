package co.edu.uniajc.services.wse_estado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import co.edu.uniajc.services.wse_estado.model.Referencias;

@Repository
public interface ReferenciasRepository extends JpaRepository<Referencias, Integer>{

}
