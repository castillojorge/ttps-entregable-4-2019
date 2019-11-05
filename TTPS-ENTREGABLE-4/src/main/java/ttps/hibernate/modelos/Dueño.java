package ttps.hibernate.modelos;

import java.io.Serializable;
import java.util.List;

public class Due�o implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id_due�o;
	private String nombre;
	private String apellido;
	private int telefono;
	private String email;
	private List<Mascota> mascotas;
	private FichaPublica fpublica;
}
