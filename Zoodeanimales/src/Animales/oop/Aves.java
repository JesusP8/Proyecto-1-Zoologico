package Animales.oop;

import Interfaz.Respirar;

public class Aves extends Animales implements Respirar {

  public Aves() {
    super();
  }

  public Aves(String name, float height, float weight, String tipodeanimal) {
    super(name, height, weight, tipodeanimal);

  }

    @Override
    public void comer() {
      System.out.println("Las Aves comen");

    }

    @Override
    public void dormir() {
      System.out.println("Las Aves duermen");

    }

    public void Sociabilidad() {
        System.out.println("Las Aves viajan en manadas");

    }

    @Override
    public void respirar() {
      System.out.println("Las aves respiran");

    }

    public String toString() {
      return super.toString();
      
    }

}

