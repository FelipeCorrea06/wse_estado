package co.edu.uniajc.services.wse_estado.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="experiencia_laboral")
public class Experiencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="empresa")
	private String empresa;
	@Column(name="fecha_inicio")
	private Date fecha_inicio;
	@Column(name="fecha_fin")
	private Date fecha_fin;
	@Column(name="cargo")
	private String cargo;
	@Column(name="funciones")
	private String funciones;
	@Column(name="actualmente")
	private int actualmente;
	@Column(name="persona_id")
	private int persona_id;
	
	
	public Experiencia() {
		super();
	}


	public Experiencia(int id, String empresa, Date fecha_inicio, Date fecha_fin, String cargo, String funciones,
			int actualmente, int persona_id) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.cargo = cargo;
		this.funciones = funciones;
		this.actualmente = actualmente;
		this.persona_id = persona_id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
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


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getFunciones() {
		return funciones;
	}


	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}


	public int getActualmente() {
		return actualmente;
	}


	public void setActualmente(int actualmente) {
		this.actualmente = actualmente;
	}


	public int getPersona_id() {
		return persona_id;
	}


	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}

	
}
