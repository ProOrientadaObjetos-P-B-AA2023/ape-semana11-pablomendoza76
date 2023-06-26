/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Usuario iTC
 */
public class MenuEconomico extends Menu {
    private double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorMenu, double valorInicialMenu, double porcentajeDescuento, double par1) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String toString() {
        return "Menú Económico\n" +
                "Nombre del plato: " + nombrePlato + "\n" +
                "Valor del menú: " + valorMenu + "\n" +
                "Valor inicial del menú: " + valorInicialMenu + "\n" +
                "Porcentaje de descuento: " + porcentajeDescuento;
    }
}

