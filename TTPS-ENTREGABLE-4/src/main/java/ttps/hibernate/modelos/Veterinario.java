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

}
