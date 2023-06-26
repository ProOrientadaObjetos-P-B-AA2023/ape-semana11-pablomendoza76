/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Usuario iTC
 */
class MenuCarta extends Menu {
    public double valorGuarnicion;
    public double valorBebida;
    public double valorServicio;

    public MenuCarta(String nombrePlato, double valoraMenu, double valorInicial, double valorGuarnicion, double valorBebida, double valorServicio) {
        super(nombrePlato, valoraMenu, valorInicial);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
    }

    public double getValorGuarnicion() {
        return valorGuarnicion;
    }

    public void setValorGuarnicion(double valorGuarnicion) {
        this.valorGuarnicion = valorGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double getValorServicio() {
        return valorServicio;
    }

    public void setValorServicio(double valorServicio) {
        this.valorServicio = valorServicio;
    }

    public void sistema() {
        System.out.println("\tValor de porción de guarnicion: " + getValorGuarnicion());
        System.out.println("\tValor Bebida: " + getValorBebida());
        System.out.println("\tValor del servicio: " + getValorServicio());
    }
}


