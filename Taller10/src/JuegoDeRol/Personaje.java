/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuegoDeRol;

/**
 *
 * @author Usuario iTC
 */
public abstract class Personaje {
    private String nombre;
    private int nivel;
    private int puntosDeVida;
    private int experiencia;

    public Personaje(String nombre, int nivel, int puntosDeVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.experiencia = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public void subirNivel() {
        nivel++;
        System.out.println(nombre + " ha subido de nivel. Nuevo nivel: " + nivel);
    }

    public void ganarExperiencia(int cantidad) {
        experiencia += cantidad;
        System.out.println(nombre + " ha ganado " + cantidad + " puntos de experiencia.");
        if (experiencia >= 100) {
            subirNivel();
            experiencia = 0;
        }
    }

    public abstract void atacar(Personaje personaje);

    public abstract void defender();
}
