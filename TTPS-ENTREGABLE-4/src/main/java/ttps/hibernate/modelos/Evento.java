package ttps.hibernate.modelos;

import java.io.Serializable;
import java.util.Date;

public class Evento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id_evento;
	private Date fecha;
	private String descripcion;
	private int nroCachorros;
	private String droga;
	private String resultado;
	private TipoEvento tEvento;
	
	public Evento() {
		
	}

	public Evento(int id_evento, Date fecha, String descripcion, int nroCachorros, String droga, String resultado,
			TipoEvento tEvento) {
		this.id_evento = id_evento;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.nroCachorros = nroCachorros;
		this.droga = droga;
		this.resultado = resultado;
		this.tEvento = tEvento;
	}

	public int getId_evento() {
		return id_evento;
	}

	public void setId_evento(int id_evento) {
		this.id_evento = id_evento;
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

	public int getNroCachorros() {
		return nroCachorros;
	}

	public void setNroCachorros(int nroCachorros) {
		this.nroCachorros = nroCachorros;
	}

	public String getDroga() {
		return droga;
	}

	public void setDroga(String droga) {
		this.droga = droga;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public TipoEvento gettEvento() {
		return tEvento;
	}

	public void settEvento(TipoEvento tEvento) {
		this.tEvento = tEvento;
	}

	@Override
	public String toString() {
		return "Evento [id_evento=" + id_evento + ", fecha=" + fecha + ", descripcion=" + descripcion
				+ ", nroCachorros=" + nroCachorros + ", droga=" + droga + ", resultado=" + resultado + ", tEvento="
				+ tEvento + "]";
	}
		
}
