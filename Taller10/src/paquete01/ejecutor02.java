
package paquete01;
/**
 *
 * @author reroes
 */
import java.util.ArrayList;
public class Ejecutor02 {
    public static void main(String[] args) {
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
                {"Niños 02", "3.00", "1", "1.5"},
                {"Niños 03", "2.00", "2", "0.5"}
        };

        String[][] datos002 = {{"Econo 001", "4", "25"},
                {"Econo 002", "4", "15"},
                {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
                {"Dia 002", "6", "2", "2"},
                {"Dia 003", "5.5", "3", "1"}
        };

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
                {"Carta 002", "7", "1.7", "2.1", "5"},
                {"Carta 003", "8", "1.9", "2.2", "5"},
                {"Carta 004", "9", "2.5", "2.9", "5"}
        };

        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();

        // Agregar objetos de tipo Menu Niños
        for (String[] dato : datos001) {
            MenuNinos menuNinos = new MenuNinos(dato[0], Double.parseDouble(dato[1]), Double.parseDouble(dato[2]),
                    Double.parseDouble(dato[3]), Double.parseDouble(dato[3]));
            lista.add(menuNinos);
        }

        // Agregar objetos de tipo Menu Económico
        for (String[] dato : datos002) {
            MenuEconomico menuEconomico = new MenuEconomico(dato[0], Double.parseDouble(dato[1]),
                    Double.parseDouble(dato[2]), Double.parseDouble(dato[2]), 0.1);
            lista.add(menuEconomico);
        }

        // Agregar objetos de tipo Menu Día
        for (String[] dato : datos003) {
            MenuDia menuDia = new MenuDia(dato[0], Double.parseDouble(dato[1]), Double.parseDouble(dato[2]),
                    Double.parseDouble(dato[3]), Double.parseDouble(dato[3]));
            lista.add(menuDia);
        }

        // Agregar objetos de tipo Menu Carta
        for (String[] dato : datos004) {
            MenuCarta menuCarta = new MenuCarta(dato[0], Double.parseDouble(dato[1]), Double.parseDouble(dato[2]),
                    Double.parseDouble(dato[3]), Double.parseDouble(dato[4]), 0.1);
            lista.add(menuCarta);
        }

        for (Menu menu : lista) {
            menu.establecerValorMenu();
        }

        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 0.12);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorCancelar();
        System.out.println(miCuenta);
    }
}
