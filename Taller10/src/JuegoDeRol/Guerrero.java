/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuegoDeRol;

/**
 *
 * @author Usuario iTC
 */
public class Guerrero extends Personaje {
    public Guerrero(String nombre, int nivel, int puntosDeVida) {
        super(nombre, nivel, puntosDeVida);
    }

    @Override
    public void atacar(Personaje personaje) {
        int ataque = 20 * getNivel();
        personaje.setPuntosDeVida(personaje.getPuntosDeVida() - ataque);
        System.out.println(getNombre() + " ataca a " + personaje.getNombre() + " causando " + ataque + " puntos de daño.");
        if (personaje.getPuntosDeVida() <= 0) {
            System.out.println(personaje.getNombre() + " ha sido derrotado.");
            ganarExperiencia(50);
        }
    }

    @Override
    public void defender() {
        System.out.println(getNombre() + " se defiende y no recibe daño.");
    }
}