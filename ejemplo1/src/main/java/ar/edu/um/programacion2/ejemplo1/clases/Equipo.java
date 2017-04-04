package ar.edu.um.programacion2.ejemplo1.clases;

import java.util.List;

public class Equipo {
	protected String nombre;
	protected Jugador[] jugadores;
	private int posicion;
	
	
	public Equipo() {
		this.nombre="";
		this.jugadores = new Jugador[20];
		this.posicion=0;
	}
	
	public Equipo(String nombre) {
		this.nombre=nombre;
		this.jugadores = new Jugador[20];
		this.posicion=0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Jugador[] getJugadores() {
		return jugadores;
	}
	
	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
	
	public void agregarJugador(Jugador jugador) {
		this.jugadores[this.posicion]=jugador;
		this.posicion++;
	}
	
	public String toString() {
		String resultado="El equipo se llama: "+this.nombre + "\n";
		resultado=resultado + "La lista de jugadores es: \n";
		for(int cont=0;cont<this.posicion;cont++) {
			resultado=resultado+" "+this.jugadores[cont].toString()+"\n";
		}
		return resultado;
	}
	
}
