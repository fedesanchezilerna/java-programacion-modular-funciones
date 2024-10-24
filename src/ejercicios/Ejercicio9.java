/*
 * Ejercicio9 10/16/2024
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
 * Indica si un número es o no un número primo.
 */
public class Ejercicio9 {

    public static void ejercicio9() {
        System.out.println("Introduce un número para comprobar si es primo: ");
        int numero = ScannerUtils.readInt();

        // Verificación de número primo
        boolean resultado = esPrimo(numero);
        if (resultado) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }


    /**
     * Comprueba si un número es primo
     *
     * @param numero el número a comprobar
     * @return true si el número es primo, false en caso contrario
     */
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true;  // Único par que es primo
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) { // Math.sqrt en lugar de numero reduce significativamente iteraciones en números grandes
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

