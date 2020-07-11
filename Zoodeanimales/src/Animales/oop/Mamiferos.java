package Animales.oop;

import Interfaz.Respirar;

public class Mamiferos extends Animales implements Respirar {

	public Mamiferos() {
		super();
	}
	
	public Mamiferos(String name, float height, float weight, String tipodeanimal ) {
		super(name, height, weight, tipodeanimal);
	}
	
	@Override
	public void comer() {
		System.out.println("Los animales mamiferos comen");

	}

	@Override
	public void dormir() {
		System.out.println("Los animales mamiferos duermen");

	}

	public void desplazamiento() {
		System.out.println("Estos animales mamiferos Caminan a 4 patas");

	}

	@Override
	public void respirar() {
		System.out.println("Los animales mamiferos respiran");

	}

	public String toString() {
		return super.toString();
		
	}
}
