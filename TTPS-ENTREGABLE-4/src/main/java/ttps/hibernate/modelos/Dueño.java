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
	
	public Due�o() {
		
	}

	public Due�o(int id_due�o, String nombre, String apellido, int telefono, String email, List<Mascota> mascotas,
			FichaPublica fpublica) {
		this.id_due�o = id_due�o;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.mascotas = mascotas;
		this.fpublica = fpublica;
	}

	public int getId_due�o() {
		return id_due�o;
	}

	public void setId_due�o(int id_due�o) {
		this.id_due�o = id_due�o;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	public FichaPublica getFpublica() {
		return fpublica;
	}

	public void setFpublica(FichaPublica fpublica) {
		this.fpublica = fpublica;
	}

	@Override
	public String toString() {
		return "Due�o [id_due�o=" + id_due�o + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", email=" + email + ", mascotas=" + mascotas + ", fpublica=" + fpublica + "]";
	}
		
	
}
