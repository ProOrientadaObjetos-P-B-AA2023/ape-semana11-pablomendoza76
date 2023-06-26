/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuegoDeRol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
// Clase de prueba/ejecutor
public class Ejecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Personaje> personajes = new ArrayList<>();

        int opcion;
        do {
            System.out.println("--- Menú ---");
            System.out.println("1. Crear guerrero");
            System.out.println("2. Crear mago");
            System.out.println("3. Crear arquero");
            System.out.println("4. Realizar batalla");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del guerrero: ");
                    String nombreGuerrero = scanner.nextLine();
                    personajes.add(new Guerrero(nombreGuerrero, 1, 100));
                    System.out.println("Guerrero creado con éxito.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del mago: ");
                    String nombreMago = scanner.nextLine();
                    personajes.add(new Mago(nombreMago, 1, 80));
                    System.out.println("Mago creado con éxito.");
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del arquero: ");
                    String nombreArquero = scanner.nextLine();
                    personajes.add(new Arquero(nombreArquero, 1, 90));
                    System.out.println("Arquero creado con éxito.");
                    break;
                case 4:
                    if (personajes.size() < 2) {
                        System.out.println("Debe haber al menos 2 personajes creados para realizar una batalla.");
                    } else {
                        realizarBatalla(personajes);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

            System.out.println();
        } while (opcion != 5);
    }

    private static void realizarBatalla(List<Personaje> personajes) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Selección de personajes ---");
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println((i + 1) + ". " + personajes.get(i).getNombre());
        }

        System.out.print("Seleccione el personaje 1: ");
        int id1 = scanner.nextInt();
        System.out.print("Seleccione el personaje 2: ");
        int id2 = scanner.nextInt();

        if (id1 >= 1 && id1 <= personajes.size()
                && id1 >= 1 && id2 <= personajes.size()
                && id1 != id2) {
            Personaje personaje1 = personajes.get(id1 - 1);
            Personaje personaje2 = personajes.get(id2 - 1);

            System.out.println("--- Batalla ---");

            while (personaje1.getPuntosDeVida() > 0 && personaje2.getPuntosDeVida() > 0) {
                System.out.println(personaje1.getNombre() + ":");
                System.out.println("1. Atacar");
                System.out.println("2. Defender");
                System.out.print("Ingrese la acción: ");
                int accionPersonaje1 = scanner.nextInt();
                scanner.nextLine();

                System.out.println(personaje2.getNombre() + ":");
                System.out.println("1. Atacar");
                System.out.println("2. Defender");
                System.out.print("Ingrese la acción: ");
                int accionPersonaje2 = scanner.nextInt();
                scanner.nextLine();

                if (accionPersonaje1 == 1) {
                    personaje1.atacar(personaje2);
                } else if (accionPersonaje1 == 2) {
                    personaje1.defender();
                } else {
                    System.out.println("Acción inválida. Se considera como defensa.");
                    personaje1.defender();
                }

                if (accionPersonaje2 == 1) {
                    personaje2.atacar(personaje1);
                } else if (accionPersonaje2 == 2) {
                    personaje2.defender();
                } else {
                    System.out.println("Acción inválida. Se considera como defensa.");
                    personaje2.defender();
                }

                System.out.println(personaje1.getNombre() + ": " + personaje1.getPuntosDeVida() + " puntos de vida");
                System.out.println(personaje2.getNombre() + ": " + personaje2.getPuntosDeVida() + " puntos de vida");
            }

            System.out.println("Batalla finalizada.");

            if (personaje1.getPuntosDeVida() > 0) {
                personaje1.ganarExperiencia(100);
                System.out.println(personaje1.getNombre() + " ha ganado la batalla!");
            } else if (personaje2.getPuntosDeVida() > 0) {
                personaje2.ganarExperiencia(100);
                System.out.println(personaje2.getNombre() + " ha ganado la batalla!");
            } else {
                System.out.println("Ha sido un empate.");
            }
        } else {
            System.out.println("Selección inválida. Por favor, seleccione personajes válidos.");
        }
    }
}