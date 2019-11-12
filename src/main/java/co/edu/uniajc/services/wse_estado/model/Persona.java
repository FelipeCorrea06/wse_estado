package co.edu.uniajc.services.wse_estado.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	@Id
	   @Column
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int id;
	   @Column
	   private int documento;
	   @Column
	   private String nombre;
	   @Column
	   private String apellido;
	   @Column
	   private int telefono;
	   @Column
	   private String clave;
	   @Column
	   private Date fecha_nacimiento;
	   @Column
	   private int estado_civil_id;
	   @Column
	   private int tipo_documento_id;
	   @Column
	   private String direccion;
	   @Column
	   private int barrio_id;
	   @Column
	   private int profesion_id;

	   public int getId() {
	       return id;
	   }

	   public void setId(int id) {
	       this.id = id;
	   }

	   public int getDocumento() {
	       return documento;
	   }

	   public void setDocumento(int documento) {
	       this.documento = documento;
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

	   public int getTelefono() {
	       return telefono;
	   }

	   public void setTelefono(int telefono) {
	       this.telefono = telefono;
	   }

	   public String getClave() {
	       return clave;
	   }

	   public void setClave(String clave) {
	       this.clave = clave;
	   }

	   public Date getFecha_nacimiento() {
	       return fecha_nacimiento;
	   }

	   public void setFecha_nacimiento(Date fecha_nacimiento) {
	       this.fecha_nacimiento = fecha_nacimiento;
	   }

	   public int getEstado_civil_id() {
	       return estado_civil_id;
	   }

	   public void setEstado_civil_id(int estado_civil_id) {
	       this.estado_civil_id = estado_civil_id;
	   }

	   public int getTipo_documento_id() {
	       return tipo_documento_id;
	   }

	   public void setTipo_documento_id(int tipo_documento_id) {
	       this.tipo_documento_id = tipo_documento_id;
	   }

	   public String getDireccion() {
	       return direccion;
	   }

	   public void setDireccion(String direccion) {
	       this.direccion = direccion;
	   }

	   public int getBarrio_id() {
	       return barrio_id;
	   }

	   public void setBarrio_id(int barrio_id) {
	       this.barrio_id = barrio_id;
	   }

	   public int getProfesion_id() {
	       return profesion_id;
	   }

	   public void setProfesion_id(int profesion_id) {
	       this.profesion_id = profesion_id;
	   }
}
