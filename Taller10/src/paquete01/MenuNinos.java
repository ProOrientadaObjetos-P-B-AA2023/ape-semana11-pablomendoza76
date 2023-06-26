/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Usuario iTC
 */
class MenuNinos extends Menu {
    public double porcionHelado;
    public double porcionPastel;

    public MenuNinos(String nombrePlato, double valoraMenu, double valorInicial, double porcionHelado, double porcionPastel) {
        super(nombrePlato, valoraMenu, valorInicial);
        this.porcionHelado = porcionHelado;
        this.porcionPastel = porcionPastel;
    }

    public double getPorcionHelado() {
        return porcionHelado;
    }

    public void setPorcionHelado(double porcionHelado) {
        this.porcionHelado = porcionHelado;
    }

    public double getPorcionPastel() {
        return porcionPastel;
    }

    public void setPorcionPastel(double porcionPastel) {
        this.porcionPastel = porcionPastel;
    }

    public void Interfaz() {
        System.out.println("\tValor de porción de Helado: " + getPorcionHelado());
        System.out.println("\tValor de porción de pastel: " + getPorcionPastel());
    }
}
