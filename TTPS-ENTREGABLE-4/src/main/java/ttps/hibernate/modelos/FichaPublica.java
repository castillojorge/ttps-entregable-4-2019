package ttps.hibernate.modelos;

import java.io.Serializable;

public class FichaPublica implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id_ficha_publica;
	private Boolean nombre;
	private Boolean apellido;
	private Boolean telefono;
	private Boolean email;
	private Boolean nombreMascota;
	private Boolean fechaNacimiento;
	private Boolean especie;
	private Boolean raza;
	private Boolean sexo;
	private Boolean color;
	private Boolean se�asParticulares;
	private Boolean foto;
	private Boolean miDue�o;
	
	public FichaPublica() {
		
	}

	public FichaPublica(int id_ficha_publica, Boolean nombre, Boolean apellido, Boolean telefono, Boolean email,
			Boolean nombreMascota, Boolean fechaNacimiento, Boolean especie, Boolean raza, Boolean sexo, Boolean color,
			Boolean se�asParticulares, Boolean foto, Boolean miDue�o) {
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
		this.miDue�o = miDue�o;
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

	public Boolean getMiDue�o() {
		return miDue�o;
	}

	public void setMiDue�o(Boolean miDue�o) {
		this.miDue�o = miDue�o;
	}

	@Override
	public String toString() {
		return "FichaPublica [id_ficha_publica=" + id_ficha_publica + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", telefono=" + telefono + ", email=" + email + ", nombreMascota=" + nombreMascota
				+ ", fechaNacimiento=" + fechaNacimiento + ", especie=" + especie + ", raza=" + raza + ", sexo=" + sexo
				+ ", color=" + color + ", se�asParticulares=" + se�asParticulares + ", foto=" + foto + ", miDue�o="
				+ miDue�o + "]";
	}
	
}
