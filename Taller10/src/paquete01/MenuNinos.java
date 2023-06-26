/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Usuario iTC
 */
public class MenuNinos extends Menu {
    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nombrePlato, double valorMenu, double valorInicialMenu, double valorHelado,
                     double valorPastel) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }

    public String toString() {
        return "Menú de Niños\n" +
                "Nombre del plato: " + nombrePlato + "\n" +
                "Valor del menú: " + valorMenu + "\n" +
                "Valor inicial del menú: " + valorInicialMenu + "\n" +
                "Valor de porción de helado: " + valorHelado + "\n" +
                "Valor de porción de pastel: " + valorPastel;
    }
}
