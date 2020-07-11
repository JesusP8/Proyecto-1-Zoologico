package Animales.oop;

public abstract class Animales {

	private String name;
	private float weight;
	private float height;
	private String tipodeanimal;
	
	public Animales() {
	}
	
	public Animales(String name, float weight, float height, String tipodeanimal) {
		this.name = name;
		this.weight = (float) 3.2 ;
		this.height= (float) 3.2 ; 
	}

	public abstract void comer();

	public abstract void dormir();
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getheight() {
		return height;
	}

	public void setheight(float height) {
		this.height = height;
	}

	public String gettipodeanimal() {
		return tipodeanimal;
	}

	public void settipodeanimal(String tipodeanimal) {
		this.tipodeanimal = tipodeanimal; }
		
	public String toString() {
			return "\n Nombre:" + this.getName() + "\n Weight(Peso):" + this.getWeight() + "\n height(Estatura):" + this.getheight() + "\n Tipo de Animal:" + this.gettipodeanimal();
		}

	}

	