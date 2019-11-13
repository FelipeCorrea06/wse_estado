package co.edu.uniajc.services.wse_estado.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="referencias")
public class Referencias {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="persona_id")
	private int persona_id;
	
	@Column(name="tipo_referencia")
	private String tipo_referencia;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="correo")
	private String correo;

	@Column(name="telefono")
	private int telefono;

	public Referencias(int id, int persona_id, String tipo_referencia, String nombre, String apellido, String correo,
			int telefono) {
		super();
		this.id = id;
		this.persona_id = persona_id;
		this.tipo_referencia = tipo_referencia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
	}
	public Referencias() {
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

	public String getTipo_referencia() {
		return tipo_referencia;
	}

	public void setTipo_referencia(String tipo_referencia) {
		this.tipo_referencia = tipo_referencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
