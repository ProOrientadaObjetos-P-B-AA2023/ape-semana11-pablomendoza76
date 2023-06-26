/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Usuario iTC
 */
class MenuDia extends Menu {
    public double valorPostre;
    public double valorBebida;

    public MenuDia(String nombrePlato, double valoraMenu, double valorInicial, double valorPostre, double valorBebida) {
        super(nombrePlato, valoraMenu, valorInicial);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public void Interfaz() {
        System.out.println("\tValor del Postre: " + getValorPostre());
        System.out.println("\tValor de Bebida: " + getValorBebida());
    }
}

