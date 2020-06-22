package Animales.oop;

import Interfaz.Respirar;

public class Reptiles extends Animales implements Respirar {

    public Reptiles() {
		super();
  	}
	
	  public Reptiles(String name, float height, float weight, String tipodeanimal ) {
		super(name, height, weight, tipodeanimal);
  	}

    @Override
    public void comer() {
      System.out.println("Los reptiles comen");

    }

    @Override
    public void dormir() {
      System.out.println("Los reptiles duermen");

    }

    public void desplazamiento() {
        System.out.println("Los reptiles caminan a 4 patas a excepcion de la serpiente que se arrastra");

    }

    @Override
    public void respirar() {
      System.out.println("Los reptiles respiran");

    }

    public String toString() {
      return super.toString();

    }
    
}