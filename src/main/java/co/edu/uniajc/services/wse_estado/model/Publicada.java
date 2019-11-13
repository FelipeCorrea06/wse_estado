package co.edu.uniajc.services.wse_estado.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="publicada")
public class Publicada {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="persona_id")
	private int persona_id;
	
	@Column(name="url")
	private String url;
	
	@Column(name="publicada")
	private int publicada;
	
	@Column(name="plantilla")
	private int plantilla;

	public Publicada(int id, int persona_id, String url, int publicada, int plantilla) {
		super();
		this.id = id;
		this.persona_id = persona_id;
		this.url = url;
		this.publicada = publicada;
		this.plantilla = plantilla;
	}
	
	public Publicada() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPersona_id() {
		return persona_id;
	}

	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getPublicada() {
		return publicada;
	}

	public void setPublicada(int publicada) {
		this.publicada = publicada;
	}

	public int getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(int plantilla) {
		this.plantilla = plantilla;
	}

	
	
}
