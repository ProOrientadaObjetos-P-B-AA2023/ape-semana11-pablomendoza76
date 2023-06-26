/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuegoDeRol;

/**
 *
 * @author Usuario iTC
 */
public class Mago extends Personaje {
    public Mago(String nombre, int nivel, int puntosDeVida) {
        super(nombre, nivel, puntosDeVida);
    }

    @Override
    public void atacar(Personaje personaje) {
        int ataque = 15 * getNivel();
        personaje.setPuntosDeVida(personaje.getPuntosDeVida() - ataque);
        System.out.println(getNombre() + " lanza un hechizo a " + personaje.getNombre() + " causando " + ataque + " puntos de daño.");
        if (personaje.getPuntosDeVida() <= 0) {
            System.out.println(personaje.getNombre() + " ha sido derrotado.");
            ganarExperiencia(40);
        }
    }

    @Override
    public void defender() {
        System.out.println(getNombre() + " se protege con un escudo mágico y no recibe daño.");
    }
}