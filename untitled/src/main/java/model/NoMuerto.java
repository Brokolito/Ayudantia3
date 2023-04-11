package model;

import java.util.ArrayList;

public class NoMuerto extends Enemigo {

	public NoMuerto(String nombre) {
		super(nombre);
		this.fuerza=1;
		this.inteligencia=0;
		this.bloqueo=3;
		this.armadura=10;
		this.estamina=10;
		this.objetos=new ArrayList<>();
		int vidaExtra=0;
		for(Objeto objeto:this.objetos){
			vidaExtra=+ objeto.getVida();
		}
		this.vida=1000+vidaExtra;
	}
	public int atacar(){
		return (this.fuerza+this.inteligencia+5);

	}

	public String getType() {
		return "No Muerto";
	}


}