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
}
