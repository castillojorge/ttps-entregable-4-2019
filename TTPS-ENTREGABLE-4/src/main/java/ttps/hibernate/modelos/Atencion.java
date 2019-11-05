package ttps.hibernate.modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Atencion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id_atencion;
	private Date fecha;
	private int peso;
	private String indicaciones;
	private String diagnostico;
	private String motivo;
	private Mascota mascota;
	private List<Evento> eventos;
	
	public Atencion() {
		
	}

	public Atencion(int id_atencion, Date fecha, int peso, String indicaciones, String diagnostico, String motivo,
			Mascota mascota, List<Evento> eventos) {
		this.id_atencion = id_atencion;
		this.fecha = fecha;
		this.peso = peso;
		this.indicaciones = indicaciones;
		this.diagnostico = diagnostico;
		this.motivo = motivo;
		this.mascota = mascota;
		this.eventos = eventos;
	}

	public int getId_atencion() {
		return id_atencion;
	}

	public void setId_atencion(int id_atencion) {
		this.id_atencion = id_atencion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getIndicaciones() {
		return indicaciones;
	}

	public void setIndicaciones(String indicaciones) {
		this.indicaciones = indicaciones;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	@Override
	public String toString() {
		return "Atencion [id_atencion=" + id_atencion + ", fecha=" + fecha + ", peso=" + peso + ", indicaciones="
				+ indicaciones + ", diagnostico=" + diagnostico + ", motivo=" + motivo + ", mascota=" + mascota
				+ ", eventos=" + eventos + "]";
	}
	

}
