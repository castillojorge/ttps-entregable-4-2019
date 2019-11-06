package ttps.hibernate.modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Mascota")
public class Mascota implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="id_mascota")
	private int id_mascota;
	
	@Column
	private String nombre;
	
	@Column
	private Date fechaNacimiento;
	
	@Column
	private String especie;
	
	@Column
	private String raza;
	
	@Column
	private String sexo;
	
	@Column
	private String color;
	
	@Column
	private String se�asParticulares;
	
	@Column
	private String foto; //Ver Como Manejar en Java y La Bd Fotos
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_due�o")
	private Due�o miDue�o;
	
	private List<Recordatorio> misRecordatorios;
	private List<Evento> misEventos;
	
	public Mascota() {
		
	}

	public Mascota(int id_mascota, String nombre, Date fechaNacimiento, String especie, String raza, String sexo,
			String color, String se�asParticulares, String foto, Due�o miDue�o, List<Recordatorio> misRecordatorios,
			List<Evento> misEventos) {
		this.id_mascota = id_mascota;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.especie = especie;
		this.raza = raza;
		this.sexo = sexo;
		this.color = color;
		this.se�asParticulares = se�asParticulares;
		this.foto = foto;
		this.miDue�o = miDue�o;
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

	public String getSe�asParticulares() {
		return se�asParticulares;
	}

	public void setSe�asParticulares(String se�asParticulares) {
		this.se�asParticulares = se�asParticulares;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Due�o getMiDue�o() {
		return miDue�o;
	}

	public void setMiDue�o(Due�o miDue�o) {
		this.miDue�o = miDue�o;
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
				+ ", se�asParticulares=" + se�asParticulares + ", foto=" + foto + ", miDue�o=" + miDue�o
				+ ", misRecordatorios=" + misRecordatorios + ", misEventos=" + misEventos + "]";
	}
		
}
