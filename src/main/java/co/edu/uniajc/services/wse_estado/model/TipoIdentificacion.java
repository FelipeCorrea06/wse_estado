package co.edu.uniajc.services.wse_estado.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tipo_documento")
public class TipoIdentificacion {
	
	@Id
	@Column (name = "id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_identificacion; 
	@Column (name = "nombre")
	private String descripcion;
	@Column (name = "abreviatura")
	private String abreviatura;
	
	public TipoIdentificacion() {
	}

	public TipoIdentificacion(int id_identificacion, String descripcion, String abreviatura) {
		this.id_identificacion = id_identificacion;
		this.descripcion = descripcion;
		this.abreviatura = abreviatura;
	}

	public int getId_identificacion() {
		return id_identificacion;
	}

	public void setId_identificacion(int id_identificacion) {
		this.id_identificacion = id_identificacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	@Override
	public String toString() {
		return "TipoIdentificacion [id_identificacion=" + id_identificacion + ", descripcion=" + descripcion + "]";
	}
	
	

}

