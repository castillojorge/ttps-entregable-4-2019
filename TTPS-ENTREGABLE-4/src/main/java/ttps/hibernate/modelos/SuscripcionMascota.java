package ttps.hibernate.modelos;

import java.io.Serializable;
import java.util.Date;

public class SuscripcionMascota implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id_suscripcion_mascota;
	private Date fecha;
	private String estado;
	private Mascota mascota;

}
