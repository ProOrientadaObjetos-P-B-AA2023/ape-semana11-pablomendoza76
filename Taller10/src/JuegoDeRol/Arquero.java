/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuegoDeRol;

/**
 *
 * @author Usuario iTC
 */
public class Arquero extends Personaje {
    public Arquero(String nombre, int nivel, int puntosDeVida) {
        super(nombre, nivel, puntosDeVida);
    }

    @Override
    public void atacar(Personaje personaje) {
        int ataque = 18 * getNivel();
        personaje.setPuntosDeVida(personaje.getPuntosDeVida() - ataque);
        System.out.println(getNombre() + " dispara una flecha a " + personaje.getNombre() + " causando " + ataque + " puntos de daño.");
        if (personaje.getPuntosDeVida() <= 0) {
            System.out.println(personaje.getNombre() + " ha sido derrotado.");
            ganarExperiencia(45);
        }
    }

    @Override
    public void defender() {
        System.out.println(getNombre() + " se agacha y esquiva el ataque, no recibe daño.");
    }
}