package ar.edu.um.programacion2.ejemplo1.clases;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inicio inicio = new Inicio();
		inicio.arrancar();
	}

	public void arrancar() {
		Jugador j1 = new Jugador("Juan", "Perez", "cachito",10);
		Jugador j2 = new Jugador();
		j2.setNombre("Gerardo");
		j2.setApellido("Lopez");
		j2.setSobreNombre("pelado");
		j2.setNumero(8);
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		Equipo equipo = new Equipo();
		equipo.setNombre("Sportivo tachito");
		equipo.agregarJugador(j1);
		equipo.agregarJugador(j2);
		System.out.println(equipo.toString());
	}
}
