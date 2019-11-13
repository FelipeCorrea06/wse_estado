package co.edu.uniajc.services.wse_estado.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="barrios")
public class Barrios {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="ciudad_id")
	private int ciudad_id;

	public Barrios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Barrios(int id, String nombre, int ciudad_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudad_id = ciudad_id;
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

	public int getCiudad_id() {
		return ciudad_id;
	}

	public void setCiudad_id(int ciudad_id) {
		this.ciudad_id = ciudad_id;
	}

	
}
