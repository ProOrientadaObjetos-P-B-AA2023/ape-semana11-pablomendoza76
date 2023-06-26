/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Usuario iTC
 */
public class MenuCarta extends Menu {
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio;

    public MenuCarta(String nombrePlato, double valorMenu, double valorInicialMenu, double valorGuarnicion,
                     double valorBebida, double porcentajeServicio) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeServicio = porcentajeServicio;
    }

    public String toString() {
        return "Menú a la Carta\n" +
                "Nombre del plato: " + nombrePlato + "\n" +
                "Valor del menú: " + valorMenu + "\n" +
                "Valor inicial del menú: " + valorInicialMenu + "\n" +
                "Valor de porción de guarnición: " + valorGuarnicion + "\n" +
                "Valor de bebida: " + valorBebida + "\n" +
                "Porcentaje adicional por servicio: " + porcentajeServicio;
    }
}

