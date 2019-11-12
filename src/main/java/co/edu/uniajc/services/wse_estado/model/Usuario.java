package co.edu.uniajc.services.wse_estado.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "usuario")
public class Usuario {

	@Id
	@Column (name = "id_usuario")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_usuario;
	@Column (name = "identificacion")
	private String identificacion;
	@Column (name = "tipo_identificacion")
	private int id_tipo_identificacion;
	@Column (name = "nombre")
	private String nombre;
	@Column (name = "apellido")
	private String apellido;
	@Column (name = "direccion")
	private String direccion;
	@Column (name = "celular")
	private String celular;
	@Column (name = "email")
	private String email;
	@Column (name = "fec_creacion")
	private String fec_creacion;
	@Column (name = "fec_actualiza")
	private String fec_actualiza;
	
	public Usuario() {
		super();
	}

	public Usuario(int id_usuario, String identificacion, int id_tipo_identificacion, 
			String nombre, String apellido, String direccion, String celular, 
			String email, String fec_creacion, String fec_actualiza) {
		super();
		this.id_usuario = id_usuario;
		this.identificacion = identificacion;
		this.id_tipo_identificacion = id_tipo_identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.celular = celular;
		this.email = email;
		this.fec_creacion = fec_creacion;
		this.fec_actualiza = fec_actualiza;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public int getId_tipo_identificacion() {
		return id_tipo_identificacion;
	}

	public void setId_tipo_identificacion(int id_tipo_identificacion) {
		this.id_tipo_identificacion = id_tipo_identificacion;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFec_creacion() {
		return fec_creacion;
	}

	public void setFec_creacion(String fec_creacion) {
		this.fec_creacion = fec_creacion;
	}

	public String getFec_actualiza() {
		return fec_actualiza;
	}

	public void setFec_actualiza(String fec_actualiza) {
		this.fec_actualiza = fec_actualiza;
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", identificacion=" + identificacion + ", id_tipo_identificacion="
				+ id_tipo_identificacion + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", celular=" + celular + ", email=" + email + ", fec_creacion=" + fec_creacion + ", fec_actualiza="
				+ fec_actualiza + "]";
	}
	
	
	
}
