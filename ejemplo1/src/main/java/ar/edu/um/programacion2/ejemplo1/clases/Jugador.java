package ar.edu.um.programacion2.ejemplo1.clases;

public class Jugador {
	protected String nombre;
	protected String apellido;
	protected String sobreNombre;
	protected int numero;
	
	public Jugador() {}
	
	public Jugador(String nombre, String apellido, String sobreNombre,
			int numero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sobreNombre = sobreNombre;
		this.numero = numero;
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
	public String getSobreNombre() {
		return sobreNombre;
	}
	public void setSobreNombre(String sobreNombre) {
		this.sobreNombre = sobreNombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido
				+ ", sobreNombre=" + sobreNombre + ", numero=" + numero + "]";
	}
	
}
