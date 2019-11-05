package ttps.hibernate.modelos;

import java.io.Serializable;
import java.util.Date;

public class Recordatorio implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id_recordatorio;
	private Date fecha;
	private String descripcion;
	
	public Recordatorio() {
	
	}
	
	public Recordatorio(int id_recordatorio, Date fecha, String descripcion) {
		this.id_recordatorio = id_recordatorio;
		this.fecha = fecha;
		this.descripcion = descripcion;
	}

	public int getId_recordatorio() {
		return id_recordatorio;
	}

	public void setId_recordatorio(int id_recordatorio) {
		this.id_recordatorio = id_recordatorio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Recordatorio [id_recordatorio=" + id_recordatorio + ", fecha=" + fecha + ", descripcion=" + descripcion
				+ "]";
	}
	
}

