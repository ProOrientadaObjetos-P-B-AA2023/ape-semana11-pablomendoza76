package paquete01;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private String nombreCliente;
    private double subtotal;
    private double iva;
    private List<Menu> listaMenu;
    private double valorTotal;

    public Cuenta(String nombreCliente, ArrayList<Menu> lista, double iva) {
        this.nombreCliente = nombreCliente;
        this.iva = iva;
        this.listaMenu = new ArrayList<>();
    }

    public void agregarMenu(Menu menu) {
        listaMenu.add(menu);
        subtotal += menu.valorMenu;
    }

    public double calcularValorTotal() {
        valorTotal = subtotal + (subtotal * (iva / 100));
        return valorTotal;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(nombreCliente).append("\n");
        sb.append("Subtotal: ").append(subtotal).append("\n");
        sb.append("IVA: ").append(iva).append("%\n");
        sb.append("Menús:\n");
        for (Menu menu : listaMenu) {
            sb.append(menu.toString()).append("\n");
        }
        sb.append("Valor total a pagar: ").append(calcularValorTotal());
        return sb.toString();
    }

    void establecerSubtotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void establecerValorCancelar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

