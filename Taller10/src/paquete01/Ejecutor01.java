/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class ejecutor01 {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("René Elizalde", 10.0);

        MenuNinos menu1 = new MenuNinos("Niños 01", 4.50,2.00,1.00, 1.50);
        MenuNinos menu2 = new MenuNinos("Niños 02", 5.50, 3.00,1.00, 1.50);
        MenuEconomico menue = new MenuEconomico("Econo 001", 3.00,4.00, 25.00);
        MenuDia menuD = new MenuDia("Dia 001", 7.00,5.00,1.00, 1.00);
        MenuCarta menuC= new MenuCarta("Carta 001", 10.10,6.0,1.5,2.0, 10.00);

        cuenta.ArrayMenu(menu1);
        cuenta.ArrayMenu(menu2);
        cuenta.ArrayMenu(menue);
        cuenta.ArrayMenu(menuD);
        cuenta.ArrayMenu(menuC);

        cuenta.Factura();
    }
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/