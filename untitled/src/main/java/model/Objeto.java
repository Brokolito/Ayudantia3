package model;

public class Objeto {
	private String nombre;
	private int fuerza;
	private int inteligencia;
	private int bloqueo;
	private int armadura;
	private int estamina;
	private int vida;

	public Objeto(String nombre, int fuerza, int inteligencia, int bloqueo, int estamina, int vida) {
		this.nombre=nombre;
		this.fuerza=fuerza;
		this.inteligencia=inteligencia;
		this.bloqueo=bloqueo;
		this.estamina=estamina;
		this.vida=vida;
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

	public int getVida() {
		return this.vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
}