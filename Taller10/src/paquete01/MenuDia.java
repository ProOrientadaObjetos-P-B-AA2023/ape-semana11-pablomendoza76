/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Usuario iTC
 */
public class MenuDia extends Menu {
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nombrePlato, double valorMenu, double valorInicialMenu, double valorPostre,
                   double valorBebida) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    public String toString() {
        return "Menú del Día\n" +
                "Nombre del plato: " + nombrePlato + "\n" +
                "Valor del menú: " + valorMenu + "\n" +
                "Valor inicial del menú: " + valorInicialMenu + "\n" +
                "Valor de postre: " + valorPostre + "\n" +
                "Valor de bebida: " + valorBebida;
    }
}

