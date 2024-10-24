/*
 * Ejercicio5 10/16/2024
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
 * Muestra si es negativo, positivo o cero
 */
public class Ejercicio5 {

    public static void ejercicio5() {
        System.out.print("Escribe un número: ");
        int numero = Integer.parseInt(ScannerUtils.getScanner().nextLine());
        positivoNegativo(numero);
    }

    private static void positivoNegativo(int numero) {
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else if
        (numero < 0) {
            System.out.println("El número " + numero + " es positivo.");
        }
        else {
            System.out.println("El número es cero.");
        }
    }
}

