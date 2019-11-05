package ttps.hibernate.modelos;

import java.io.Serializable;

public class FichaPublica implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id_ficha_publica;
	private Boolean nombre;
	private Boolean apellido;
	private Boolean telefono;
	private Boolean email;
	private Boolean nombreMascota;
	private Boolean fechaNacimiento;
	private Boolean especie;
	private Boolean raza;
	private Boolean sexo;
	private Boolean color;
	private Boolean señasParticulares;
	private Boolean foto;
	private Boolean miDueño;
}
