import java.util.ArrayList;

public class Jugador {
	private String nombre;
	private int fuerza;
	private int inteligencia;
	private int bloqueo;
	private int armadura;
	private int estamina;
	private int vida;
	private ArrayList<Objeto> objetos;

	public Jugador(String nombre) {
		this.nombre=nombre;
		this.objetos=new ArrayList<>();
		this.fuerza=1;
		this.inteligencia=2;
		this.bloqueo=5;
		this.armadura=10;
		this.estamina=10;
		int vidaExtra=0;
		for(Objeto objeto:this.objetos){
			vidaExtra=+ objeto.getVida();
		}
		this.vida=1000+vidaExtra;	}

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

	public ArrayList<Objeto> getObjetos() {
		return this.objetos;
	}

	public void setObjetos(ArrayList<Objeto> objetos) {
		this.objetos=objetos;
	}

	public int atacar() {
		return (this.fuerza+inteligencia+5);
	}
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
