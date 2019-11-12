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
	
	@Column(name="publicada_valor")
	private int publicada_valor;

	public Publicada(int id, int persona_id, String url, int publicada_valor) {
		super();
		this.id = id;
		this.persona_id = persona_id;
		this.url = url;
		this.publicada_valor = publicada_valor;
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

	public int getPublicada_valor() {
		return publicada_valor;
	}

	public void setPublicada_valor(int publicada_valor) {
		this.publicada_valor = publicada_valor;
	}
	
}
