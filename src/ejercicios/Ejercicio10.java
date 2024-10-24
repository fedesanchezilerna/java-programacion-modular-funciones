/*
 * Ejercicio10 10/16/2024
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
 * Convierte número decimal a binario.
 */
public class Ejercicio10 {

    public static void ejercicio10() {
        System.out.println("Introduce un número decimal para convertirlo a binario: ");
        int numero = ScannerUtils.readInt();

        String resultadoBinario = decimalABinario(numero);
        System.out.println("El número decimal " + numero + " en binario es: " + resultadoBinario);
    }


    /**
     * Convierte un número decimal a binario.
     *
     * @param numero el número decimal a convertir.
     * @return una cadena que representa el número en formato binario.
     */
    private static String decimalABinario(int numero) {
        if (numero == 0) {
            return "0";
        }
        StringBuilder binario = new StringBuilder();
        while (numero > 0) {
            int residuo = numero % 2;

            // Inserta el residuo al principio de la cadena
            binario.insert(0, residuo);
            numero /= 2;
        }
        return binario.toString();
    }
}
