/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Usuario iTC
 */
class MenuEconomico extends Menu{
    public double descuento;

    public MenuEconomico(String nombrePlato, double valoraMenu, double valorInicial, double descuento) {
        super(nombrePlato, valoraMenu, valorInicial);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void Interfaz() {
        System.out.println("\tValor descuento: " + getDescuento());
    }
}

