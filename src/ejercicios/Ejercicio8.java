/*
 * Ejercicio8 10/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package ejercicios;

import menu.Menu;
import utils.ScannerUtils;

/**
 * Convierte una cantidad de euros introducida a otra moneda,
 * estas pueden ser a dólares, yenes o libras.
 * El cambio de divisas es:
 * <p>
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
public class Ejercicio8 {

    public static void ejercicio8() {

        System.out.println("Ingrese una cantidad de euros a convertir: ");
        double euros = ScannerUtils.readDouble();

        Menu.despliegueMenuDivisas();

        int divisa = ScannerUtils.readInt();
        convertirEurosADivisas(euros, divisa);
    }

    private static void convertirEurosADivisas(double euros, int divisa) {
        switch (divisa) {
            case 1:
                System.out.printf("%.2f euros son %.2f dólares.\n", euros, euros * 1.28611);
                break;
            case 2:
                System.out.printf("%.2f euros son %.2f yenes.\n", euros, euros * 129.852);
                break;
            case 3:
                System.out.printf("%.2f euros son %.2f libras.\n", euros, euros * 0.86);
                break;
            default:
                System.out.println("Tipo de divisa no soportado.");
                break;
        }
    }
}
