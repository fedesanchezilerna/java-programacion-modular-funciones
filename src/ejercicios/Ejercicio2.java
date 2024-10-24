/*
 * Ejercicio2 10/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package ejercicios;

import utils.ScannerUtils;

/**
 * Calcula el Factorial de un número
 */
public class Ejercicio2 {

    public static void ejercicio2() {
        System.out.print("Ingrese un número: ");
        int num = Integer.parseInt(ScannerUtils.getScanner().nextLine());

        System.out.println("El número factorial es: " + factorial(num));
    }

    private static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
