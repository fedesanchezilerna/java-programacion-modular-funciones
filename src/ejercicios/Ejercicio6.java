/*
 * Ejercicio6 10/16/2024
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
 * Calcula suma de los dígitos
 */
public class Ejercicio6 {

    public static void ejercicio6() {
        System.out.print("Ingresa un número: ");
        int numero = Integer.parseInt(ScannerUtils.getScanner().nextLine());
        sumarDigitos(numero);
    }

    private static void sumarDigitos(int num) {
        int suma = 0;
        num = Math.abs(num);

        while (num > 0) {
            suma += num % 10;  // Extrae el último dígito y lo suma
            num /= 10;         // Elimina el último dígito
        }

        System.out.println("El resultado es: " + suma);
    }
}
