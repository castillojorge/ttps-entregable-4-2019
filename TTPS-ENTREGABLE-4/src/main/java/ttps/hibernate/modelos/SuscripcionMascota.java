package ttps.hibernate.modelos;

import java.io.Serializable;
import java.util.Date;

public class SuscripcionMascota implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id_suscripcion_mascota;
	private Date fecha;
	private String estado;
	private Mascota mascota;

	public SuscripcionMascota() {
		
	}

	public SuscripcionMascota(int id_suscripcion_mascota, Date fecha, String estado, Mascota mascota) {
		this.id_suscripcion_mascota = id_suscripcion_mascota;
		this.fecha = fecha;
		this.estado = estado;
		this.mascota = mascota;
	}

	public int getId_suscripcion_mascota() {
		return id_suscripcion_mascota;
	}

	public void setId_suscripcion_mascota(int id_suscripcion_mascota) {
		this.id_suscripcion_mascota = id_suscripcion_mascota;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	@Override
	public String toString() {
		return "SuscripcionMascota [id_suscripcion_mascota=" + id_suscripcion_mascota + ", fecha=" + fecha + ", estado="
				+ estado + ", mascota=" + mascota + "]";
	}
	
}
