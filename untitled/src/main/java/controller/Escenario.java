package controller;

import model.Enemigo;
import model.Jugador;
import model.Objeto;
import data.GestorDatos;

import java.util.ArrayList;

public class Escenario {
	private String nombre;
	private String dificultad;
	private ArrayList<Jugador> jugadores;
	private ArrayList<Enemigo> enemigos;

	public Escenario(String nombre, String dificultad, ArrayList<Jugador> jugadores, ArrayList<Enemigo> enemigos) {
		this.nombre=nombre;
		this.dificultad=dificultad;
		this.jugadores=jugadores;
		this.enemigos=enemigos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public ArrayList<Enemigo> getEnemigos() {
		return enemigos;
	}

	public String getDificultad() {
		return this.dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public boolean jugadorAtacaEnemigo(Jugador jugador, Enemigo enemigo) {
		GestorDatos gestorDatos=new GestorDatos();
		int damage=jugador.atacar();

		if(damage<enemigo.getVida()){
			boolean vivo=enemigo.getDamage(damage);
			gestorDatos.ataqueJugadorEnemigo(jugador,enemigo,damage,"logcombat");

			if(!vivo){
				muerteEnemigo(enemigo);
				gestorDatos.jugadorMataEnemigo(jugador,enemigo,"logcombat.txt");
				return true;
			}
		}else{
			gestorDatos.jugadorMataEnemigo(jugador,enemigo,"logcombat.txt");
			muerteEnemigo(enemigo);
			return true;
		}
		return false;
	}

	public boolean muerteEnemigo(Enemigo enemigo) {
		for (Enemigo enemigo1:this.enemigos){
			if(enemigo1.getNombre().equals(enemigo.getNombre())){
				enemigos.remove(enemigo1);
				return true;

			}
		}
		return false;
	}

	public boolean muerteJugador(Jugador jugador) {
		for(Jugador jugador1:this.jugadores){
			if(jugador1.getNombre().equals(jugador.getNombre())){
				jugadores.remove(jugador);
				return true;
			}
		}
		return false;
	}

	public boolean enemigoAtacaJugador(Enemigo enemigo, Jugador jugador) {
		int damage=enemigo.atacar();
		GestorDatos gestorDatos=new GestorDatos();
		if(damage<jugador.getVida()){
			boolean vivo=jugador.getDamage(damage);
			gestorDatos.ataqueEnemigoJugador(jugador,enemigo,damage,"logcombat");
			if(!vivo){
				muerteJugador(jugador);
				gestorDatos.enemigoMataJugador(jugador,enemigo,"logcombat.txt");
				return true;
			}
		}else{
			gestorDatos.enemigoMataJugador(jugador,enemigo,"logcombat.txt");
			muerteJugador(jugador);
			return true;
		}
		return false;
	}
	public boolean jugadorAtacaJugador(Jugador jugadorAtacante,Jugador jugadorAtacado){
		GestorDatos gestorDatos=new GestorDatos();
		int damage=jugadorAtacante.atacar();
		if(damage<jugadorAtacado.getVida()){
			boolean vivo=jugadorAtacado.getDamage(damage);
			gestorDatos.ataqueJugadorJugador(jugadorAtacado,jugadorAtacante,damage,"logcombat.txt");
			if(!vivo){
				muerteJugador(jugadorAtacado);
				gestorDatos.jugadorMataJugador(jugadorAtacado,jugadorAtacante,"logcombat.txt");
				return true;
			}
		}else{
			muerteJugador(jugadorAtacado);
			gestorDatos.jugadorMataJugador(jugadorAtacado,jugadorAtacante,"logcombat.txt");
			return true;
		}
		return false;
	}

	public void recogerObjetosDelEnemigo(Jugador jugador, Enemigo enemigo) {
		if(enemigo.getObjetos()!=null){
			jugador.getObjetos().addAll(enemigo.getObjetos());
			enemigo.setObjetos(null);
		}
	}
	public void recogerObjetosDelJugador(Jugador jugadorBeneficiado, Jugador jugadorPerjudicado) {
		if(jugadorPerjudicado.getObjetos()!=null){
			jugadorBeneficiado.getObjetos().addAll(jugadorPerjudicado.getObjetos());
			jugadorPerjudicado.setObjetos(null);
		}
	}

	public void recogerObjetoEncontrado(Jugador jugador, Objeto objetoEncontrado) {
		if(objetoEncontrado!=null){
			jugador.getObjetos().add(objetoEncontrado);
		}
	}
}