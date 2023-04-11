package model;

import java.util.ArrayList;

public class Atracador extends Enemigo {

	public Atracador(String nombre) {
		super(nombre);
		this.fuerza=1;
		this.inteligencia=2;
		this.bloqueo=5;
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
		return (this.fuerza+this.inteligencia+3);
	}
	public String getType() {
		return "Atracador";
	}
}