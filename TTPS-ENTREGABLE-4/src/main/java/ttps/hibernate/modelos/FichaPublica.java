package ttps.hibernate.modelos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="FichaPublica")
public class FichaPublica implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="id_ficha_publica")
	private int id_ficha_publica;
	
	@Column(name="nombre")
	private Boolean nombre;
	
	@Column(name="apellido")
	private Boolean apellido;
	
	@Column(name="telefono")
	private Boolean telefono;
	
	@Column(name="email")
	private Boolean email;
	
	@Column(name="nombreMascota")
	private Boolean nombreMascota;
	
	@Column(name="fechaNacimiento")
	private Boolean fechaNacimiento;
	
	@Column(name="especie")
	private Boolean especie;
	
	@Column(name="raza")
	private Boolean raza;
	
	@Column(name="sexo")
	private Boolean sexo;
	
	@Column(name="color")
	private Boolean color;
	
	@Column(name="se�asParticulares")
	private Boolean se�asParticulares;
	
	@Column(name="foto")
	private Boolean foto;
	
	public FichaPublica() {
		
	}

	public FichaPublica(int id_ficha_publica, Boolean nombre, Boolean apellido, Boolean telefono, Boolean email,
			Boolean nombreMascota, Boolean fechaNacimiento, Boolean especie, Boolean raza, Boolean sexo, Boolean color,
			Boolean se�asParticulares, Boolean foto) {
		this.id_ficha_publica = id_ficha_publica;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.nombreMascota = nombreMascota;
		this.fechaNacimiento = fechaNacimiento;
		this.especie = especie;
		this.raza = raza;
		this.sexo = sexo;
		this.color = color;
		this.se�asParticulares = se�asParticulares;
		this.foto = foto;
	}

	public int getId_ficha_publica() {
		return id_ficha_publica;
	}

	public void setId_ficha_publica(int id_ficha_publica) {
		this.id_ficha_publica = id_ficha_publica;
	}

	public Boolean getNombre() {
		return nombre;
	}

	public void setNombre(Boolean nombre) {
		this.nombre = nombre;
	}

	public Boolean getApellido() {
		return apellido;
	}

	public void setApellido(Boolean apellido) {
		this.apellido = apellido;
	}

	public Boolean getTelefono() {
		return telefono;
	}

	public void setTelefono(Boolean telefono) {
		this.telefono = telefono;
	}

	public Boolean getEmail() {
		return email;
	}

	public void setEmail(Boolean email) {
		this.email = email;
	}

	public Boolean getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(Boolean nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public Boolean getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Boolean fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Boolean getEspecie() {
		return especie;
	}

	public void setEspecie(Boolean especie) {
		this.especie = especie;
	}

	public Boolean getRaza() {
		return raza;
	}

	public void setRaza(Boolean raza) {
		this.raza = raza;
	}

	public Boolean getSexo() {
		return sexo;
	}

	public void setSexo(Boolean sexo) {
		this.sexo = sexo;
	}

	public Boolean getColor() {
		return color;
	}

	public void setColor(Boolean color) {
		this.color = color;
	}

	public Boolean getSe�asParticulares() {
		return se�asParticulares;
	}

	public void setSe�asParticulares(Boolean se�asParticulares) {
		this.se�asParticulares = se�asParticulares;
	}

	public Boolean getFoto() {
		return foto;
	}

	public void setFoto(Boolean foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "FichaPublica [id_ficha_publica=" + id_ficha_publica + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", telefono=" + telefono + ", email=" + email + ", nombreMascota=" + nombreMascota
				+ ", fechaNacimiento=" + fechaNacimiento + ", especie=" + especie + ", raza=" + raza + ", sexo=" + sexo
				+ ", color=" + color + ", se�asParticulares=" + se�asParticulares + ", foto=" + foto + "]";
	}
	
}
