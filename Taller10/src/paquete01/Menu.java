package paquete01;
public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String nombrePlato, double valorMenu, double valorInicialMenu) {
        this.nombrePlato = nombrePlato;
        this.valorMenu = valorMenu;
        this.valorInicialMenu = valorInicialMenu;
    }

    public abstract String toString();

    void establecerValorMenu() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String getNombrePlato() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}


