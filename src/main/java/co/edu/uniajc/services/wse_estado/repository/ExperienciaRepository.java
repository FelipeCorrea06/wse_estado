package co.edu.uniajc.services.wse_estado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.edu.uniajc.services.wse_estado.model.Experiencia;


@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer>{
}
