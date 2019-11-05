package ttps.hibernate.modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Mascota implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id_mascota;
	private String nombre;
	private Date fechaNacimiento;
	private String especie;
	private String raza;
	private String sexo;
	private String color;
	private String señasParticulares;
	private String foto;
	private Dueño miDueño;
	private List<Recordatorio> misRecordatorios;
	private List<Evento> misEventos;
	
	public Mascota() {
		
	}

	public Mascota(int id_mascota, String nombre, Date fechaNacimiento, String especie, String raza, String sexo,
			String color, String señasParticulares, String foto, Dueño miDueño, List<Recordatorio> misRecordatorios,
			List<Evento> misEventos) {
		this.id_mascota = id_mascota;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.especie = especie;
		this.raza = raza;
		this.sexo = sexo;
		this.color = color;
		this.señasParticulares = señasParticulares;
		this.foto = foto;
		this.miDueño = miDueño;
		this.misRecordatorios = misRecordatorios;
		this.misEventos = misEventos;
	}

	public int getId_mascota() {
		return id_mascota;
	}

	public void setId_mascota(int id_mascota) {
		this.id_mascota = id_mascota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSeñasParticulares() {
		return señasParticulares;
	}

	public void setSeñasParticulares(String señasParticulares) {
		this.señasParticulares = señasParticulares;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Dueño getMiDueño() {
		return miDueño;
	}

	public void setMiDueño(Dueño miDueño) {
		this.miDueño = miDueño;
	}

	public List<Recordatorio> getMisRecordatorios() {
		return misRecordatorios;
	}

	public void setMisRecordatorios(List<Recordatorio> misRecordatorios) {
		this.misRecordatorios = misRecordatorios;
	}

	public List<Evento> getMisEventos() {
		return misEventos;
	}

	public void setMisEventos(List<Evento> misEventos) {
		this.misEventos = misEventos;
	}

	@Override
	public String toString() {
		return "Mascota [id_mascota=" + id_mascota + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
				+ ", especie=" + especie + ", raza=" + raza + ", sexo=" + sexo + ", color=" + color
				+ ", señasParticulares=" + señasParticulares + ", foto=" + foto + ", miDueño=" + miDueño
				+ ", misRecordatorios=" + misRecordatorios + ", misEventos=" + misEventos + "]";
	}
		
}
