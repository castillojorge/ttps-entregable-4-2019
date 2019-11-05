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
	private String se�asParticulares;
	private String foto;
	private Due�o miDue�o;
	private List<Recordatorio> misRecordatorios;
	private List<Evento> misEventos;
	
}
