package paquete01;
abstract public class Menu {
    public String nombrePlato;
    public double valoraMenu;
    public double valorInicial;

    public Menu(String nombrePlato, double valoraMenu, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valoraMenu = valoraMenu;
        this.valorInicial = valorInicial;
    }

    public String getNombrePlato() {
       return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getValoraMenu() {
        return valoraMenu;
    }

    public void setValoraMenu(double valoraMenu) {
        this.valoraMenu = valoraMenu;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public abstract void sistema();
}
