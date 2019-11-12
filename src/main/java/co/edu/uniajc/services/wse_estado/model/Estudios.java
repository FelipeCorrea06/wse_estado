package co.edu.uniajc.services.wse_estado.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudios")
public class Estudios {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nivel_estudios_id")
	private int id_transccion;
	
	@Column(name="persona_id")
	private int id_movimiento;
	
	@Column(name="fecha_inicio")
	private Date fecha_inicio;
	
	@Column(name="fecha_fin")
	private Date fecha_fin;
	
	@Column(name="institucion")
	private String institucion;

	
	public Estudios() {
		super();
	}


	public Estudios(int id, int id_transccion, int id_movimiento, Date fecha_inicio, Date fecha_fin,
			String institucion) {
		super();
		this.id = id;
		this.id_transccion = id_transccion;
		this.id_movimiento = id_movimiento;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.institucion = institucion;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getId_transccion() {
		return id_transccion;
	}


	public void setId_transccion(int id_transccion) {
		this.id_transccion = id_transccion;
	}


	public int getId_movimiento() {
		return id_movimiento;
	}


	public void setId_movimiento(int id_movimiento) {
		this.id_movimiento = id_movimiento;
	}


	public Date getFecha_inicio() {
		return fecha_inicio;
	}


	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}


	public Date getFecha_fin() {
		return fecha_fin;
	}


	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}


	public String getInstitucion() {
		return institucion;
	}


	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	
	
}
