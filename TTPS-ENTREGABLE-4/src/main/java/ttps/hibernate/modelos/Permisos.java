package ttps.hibernate.modelos;

import java.io.Serializable;

public class Permisos implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id_permisos;
	private String nombre_permiso;
	
	public Permisos() {
		
	}

	public Permisos(int id_permisos, String nombre_permiso) {
		this.id_permisos = id_permisos;
		this.nombre_permiso = nombre_permiso;
	}

	public int getId_permisos() {
		return id_permisos;
	}

	public void setId_permisos(int id_permisos) {
		this.id_permisos = id_permisos;
	}

	public String getNombre_permiso() {
		return nombre_permiso;
	}

	public void setNombre_permiso(String nombre_permiso) {
		this.nombre_permiso = nombre_permiso;
	}

	@Override
	public String toString() {
		return "Permisos [id_permisos=" + id_permisos + ", nombre_permiso=" + nombre_permiso + "]";
	}	

}
