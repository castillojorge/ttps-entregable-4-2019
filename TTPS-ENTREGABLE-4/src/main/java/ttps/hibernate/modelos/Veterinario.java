package ttps.hibernate.modelos;

import java.io.Serializable;
import java.util.List;

public class Veterinario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id_veterinario;
	private String nombreConsultorio;
	private String direccionConsultorio;
	private String estado;
	private List<Mascota> misPacientes;
	private List<Atencion> misAtenciones;
	
	public Veterinario() {
		
	}

	public Veterinario(int id_veterinario, String nombreConsultorio, String direccionConsultorio, String estado,
			List<Mascota> misPacientes, List<Atencion> misAtenciones) {
		this.id_veterinario = id_veterinario;
		this.nombreConsultorio = nombreConsultorio;
		this.direccionConsultorio = direccionConsultorio;
		this.estado = estado;
		this.misPacientes = misPacientes;
		this.misAtenciones = misAtenciones;
	}

	public int getId_veterinario() {
		return id_veterinario;
	}

	public void setId_veterinario(int id_veterinario) {
		this.id_veterinario = id_veterinario;
	}

	public String getNombreConsultorio() {
		return nombreConsultorio;
	}

	public void setNombreConsultorio(String nombreConsultorio) {
		this.nombreConsultorio = nombreConsultorio;
	}

	public String getDireccionConsultorio() {
		return direccionConsultorio;
	}

	public void setDireccionConsultorio(String direccionConsultorio) {
		this.direccionConsultorio = direccionConsultorio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Mascota> getMisPacientes() {
		return misPacientes;
	}

	public void setMisPacientes(List<Mascota> misPacientes) {
		this.misPacientes = misPacientes;
	}

	public List<Atencion> getMisAtenciones() {
		return misAtenciones;
	}

	public void setMisAtenciones(List<Atencion> misAtenciones) {
		this.misAtenciones = misAtenciones;
	}

	@Override
	public String toString() {
		return "Veterinario [id_veterinario=" + id_veterinario + ", nombreConsultorio=" + nombreConsultorio
				+ ", direccionConsultorio=" + direccionConsultorio + ", estado=" + estado + ", misPacientes="
				+ misPacientes + ", misAtenciones=" + misAtenciones + "]";
	}
	
}
