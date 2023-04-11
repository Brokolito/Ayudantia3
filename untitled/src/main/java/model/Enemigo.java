package model;

import java.util.ArrayList;

public abstract class Enemigo {
	private String nombre;
	protected int fuerza;
	protected int inteligencia;
	protected int bloqueo;
	protected int armadura;
	protected int estamina;
	protected int vida;
	protected ArrayList<Objeto> objetos;

	public Enemigo(String nombre) {
		this.nombre=nombre;
		this.objetos=new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFuerza() {
		return this.fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getInteligencia() {
		return this.inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getBloqueo() {
		return this.bloqueo;
	}

	public void setBloqueo(int bloqueo) {
		this.bloqueo = bloqueo;
	}

	public int getArmadura() {
		return this.armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public int getEstamina() {
		return this.estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}

	public ArrayList<Objeto> getObjetos() {
		return objetos;
	}

	public void setObjetos(ArrayList<Objeto> objetos) {
		this.objetos = objetos;
	}

	public int getVida() {
		return this.vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public abstract String getType();

	public abstract int atacar();
	public boolean getDamage(int damage){
		int bloqueo=0;
		for(Objeto objeto:this.objetos){
			bloqueo=+ objeto.getBloqueo()+objeto.getArmadura();
		}
		int newDamage=bloqueo-damage;
		if(this.vida!=0){
			setVida(this.vida-newDamage);
			return true;
		}
		return false;
	}

}