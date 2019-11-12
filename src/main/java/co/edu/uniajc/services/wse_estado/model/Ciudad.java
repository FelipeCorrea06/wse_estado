package co.edu.uniajc.services.wse_estado.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ciudad")
public class Ciudad {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="estado_id")
	private int estado_id;

	public Ciudad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ciudad(int id, String nombre, int estado_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estado_id = estado_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstado_id() {
		return estado_id;
	}

	public void setEstado_id(int estado_id) {
		this.estado_id = estado_id;
	}

	
}
