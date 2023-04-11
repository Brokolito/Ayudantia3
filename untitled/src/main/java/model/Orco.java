package model;

import java.util.ArrayList;

public class Orco extends Enemigo {

	public Orco(String nombre) {
		super(nombre);
		this.objetos=new ArrayList<>();
		this.fuerza=5;
		this.inteligencia=1;
		this.bloqueo=5;
		this.armadura=10;
		this.estamina=10;
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
		return "Orco";
	}
}