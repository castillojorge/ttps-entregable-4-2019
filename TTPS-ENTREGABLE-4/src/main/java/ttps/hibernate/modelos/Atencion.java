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

}
