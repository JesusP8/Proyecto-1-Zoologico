package Animales.oop;

import java.util.ArrayList;
import java.util.Scanner;
import Grafica.*;
import cliente_servidor.Cliente1;
import cliente_servidor.Cliente2;
import java.util.InputMismatchException;

public class Main  {


	public static void main(String[] args) {
		

			{
			System.out.println("\n LISTA DE ANIMALES DEL ZOO\n");
			}

				Mamiferos d1 = new Mamiferos();
				d1.setName("Tigre");
				d1.setheight(250);
				d1.setWeight(230);
				d1.settipodeanimal("Mamiferos");

				Aves d2 = new Aves();
				d2.setName("Buitre");
				d2.setheight(250);
				d2.setWeight(70);
				d2.settipodeanimal("Aves");

				Mamiferos d3 = new Mamiferos();
				d3.setName("Leon");
				d3.setheight(120);
				d3.setWeight(180);
				d3.settipodeanimal("Mamiferos");

				Reptiles d4 = new Reptiles();
				d4.setName("Serpiente");
				d4.setheight(26);
				d4.setWeight(110);
				d4.settipodeanimal("Reptiles");

				Reptiles d5 = new Reptiles();
				d5.setName("Tortugas");
				d5.setheight(200);
				d5.setWeight(230);
				d5.settipodeanimal("Reptiles");

				Aves d6 = new Aves();
				d6.setName("Flamenco");
				d6.setheight(140);
				d6.setWeight(42);
				d6.settipodeanimal("Aves");

				Mamiferos d7 = new Mamiferos();
				d7.setName("Elefante");
				d7.setheight(300);
				d7.setWeight(5500);
				d7.settipodeanimal("Mamiferos");

				Mamiferos d8 = new Mamiferos();
				d8.setName("Caballo");
				d8.setheight(142);
				d8.setWeight(500);
				d8.settipodeanimal("Mamiferos");

				Reptiles d9 = new Reptiles();
				d9.setName("Cocodrilos");
				d9.setheight(70);
				d9.setWeight(900);
				d9.settipodeanimal("Reptiles");

				Mamiferos d10 = new Mamiferos();
				d10.setName("Mono");
				d10.setheight(40);
				d10.setWeight(14);
				d10.settipodeanimal("Mamiferos");

				Aves d11 = new Aves();
				d11.setName("Loro");
				d11.setheight(35);
				d11.setWeight(36);
				d11.settipodeanimal("Aves");

				Reptiles d12 = new Reptiles();
				d12.setName("Ranas");
				d12.setheight(10);
				d12.setWeight(15);
				d12.settipodeanimal("Reptiles");

				Reptiles d13 = new Reptiles();
				d13.setName("Camaleon");
				d13.setheight(90);
				d13.setWeight(42);
				d13.settipodeanimal("Reptiles");

				Aves d14 = new Aves();
				d14.setName("Tucan");
				d14.setheight(65);
				d14.setWeight(30);
				d14.settipodeanimal("Aves");

				Aves d15 = new Aves();
				d15.setName("Guacamayo");
				d15.setheight(70);
				d15.setWeight(20);
				d15.settipodeanimal("Aves");
				
				UI ventana1= new UI();
				ventana1.setVisible(true);
				
				new Cliente1().setVisible(false);
				new Cliente2().setVisible(false);

				Scanner sc = new Scanner(System.in);
				boolean salir = false;
				int opcion;

			while (!salir) {

				System.out.println("1.Mostrar lista de todos los animales registrados en el zoo");
				System.out.println("2.Mostrar lista de mamiferos");
				System.out.println("3.Mostrar lista de Aves");
				System.out.println("4.Mostrar lista de Reptiles");
				System.out.println("5.Agregar Animales a la lista");
				System.out.println("6.Salir y mostar el arraylist");

				try {

					System.out.println("Escribe una de las opciones");
					opcion = sc.nextInt();
					switch (opcion) {
						case 1:
							System.out.println("\n LISTA DE ANIMALES REGISTRADOS EN EL ZOO\n");

							System.out.println(d1);
							System.out.println(d2);
							System.out.println(d3);
							System.out.println(d4);
							System.out.println(d5);
							System.out.println(d6);
							System.out.println(d7);
							System.out.println(d8);
							System.out.println(d9);
							System.out.println(d10);
							System.out.println(d11);
							System.out.println(d12);
							System.out.println(d13);
							System.out.println(d14);
							System.out.println(d15);
							break;
						case 2:
							System.out.println("\n LISTA DE MAMIFEROS\n ");

							System.out.println(d1);
							System.out.println(d3);
							System.out.println(d7);
							System.out.println(d8);
							System.out.println(d10);
							d1.comer();
							d1.dormir();
							d1.desplazamiento();
							d1.respirar();

							break;

						case 3:
							System.out.println("\n LISTA DE AVES\n");

							System.out.println(d2);
							System.out.println(d6);
							System.out.println(d11);
							System.out.println(d14);
							System.out.println(d15);
							d2.comer();
							d2.dormir();
							d2.Sociabilidad();
							d2.respirar();

							break;

						case 4:
							System.out.println("\n LISTA DE REPTILES\n");

							System.out.println(d4);
							System.out.println(d5);
							System.out.println(d9);
							System.out.println(d12);
							System.out.println(d13);
							d4.comer();
							d4.dormir();
							d4.desplazamiento();
							d4.respirar();

							break;
						case 5:
							System.out.println("\n INGRESAR NUEVO ANIMAL\n");
							System.out.println("Ingrese Nombre, Peso, Estatura y tipo de animal, en ese orden");

							String name = new Scanner(System.in).nextLine();
							float height = new Scanner(System.in).nextFloat();
							float weight = new Scanner(System.in).nextFloat();
							String tipodeanimal = new Scanner(System.in).nextLine();

							System.out.println("Nombre: "+ name);
							System.out.println("Peso: "+ weight);
							System.out.println("Estatura: "+ height);
							System.out.println("Tipo de animal: "+ tipodeanimal);
							

					break;

					case 6:
					System.out.println("\n EL ARRAYLIST\n");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo se permiten números entre 1 y 6");
				}
			} catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }

		ArrayList <Aves> aves = new ArrayList<>();
			aves.add(d2);
			aves.add(d6);
			aves.add(d11);
			aves.add(d14);
			aves.add(d15);

		System.out.println("\n El Array tiene las siguientes Aves:\n " + aves);

		ArrayList <Mamiferos> mamiferos = new ArrayList<>();

			mamiferos.add(d1);
			mamiferos.add(d3);
			mamiferos.add(d7);
			mamiferos.add(d8);
			mamiferos.add(d10);

		System.out.println("\n El Array tiene los siguientes Mamiferos:\n " + mamiferos);

		ArrayList <Reptiles> reptiles = new ArrayList<>();

			reptiles.add(d4);
			reptiles.add(d5);
			reptiles.add(d9);
			reptiles.add(d12);
			reptiles.add(d13);

		System.out.println("\n El Array tiene los siguientes Reptiles:\n " + reptiles);

	}
}



