package ttps.hibernate.modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Mascota implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id_mascota;
	private String nombre;
	private Date fechaNacimiento;
	private String especie;
	private String raza;
	private String sexo;
	private String color;
	private String señasParticulares;
	private String foto;
	private Dueño miDueño;
	private List<Recordatorio> misRecordatorios;
	private List<Evento> misEventos;
	
}
