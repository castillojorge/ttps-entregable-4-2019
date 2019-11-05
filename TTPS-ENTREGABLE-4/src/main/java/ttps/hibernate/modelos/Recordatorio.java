package ttps.hibernate.modelos;

import java.io.Serializable;
import java.util.Date;

public class Recordatorio implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id_recordatorio;
	private Date fecha;
	private String descripcion;
}
