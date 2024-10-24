/*
 * Ejercicio11 10/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package ejercicios;

import utils.ScannerUtils;

public class Ejercicio11 {

    public static void ejercicio11() {
        System.out.println("Ingresa una palabra o frase para verificar si es palíndroma: ");
        String texto = ScannerUtils.getScanner().nextLine();

        esPalindromo(texto);
    }

    /**
     * Comprueba si una palabra es palíndroma
     *
     * @param texto el texto a comprobar
     */
    private static void esPalindromo(String texto) {
        texto = texto.toLowerCase().replaceAll("[^a-z0-9]", ""); // Limpia el texto, pasa a minúsculas y deja solo alfanuméricos
        int izquierda = 0;
        int derecha = texto.length() - 1;
        boolean esPalindromo = true; // Se asume que es palíndromo hasta encontrar lo contrario

        while (izquierda < derecha) {
            if (texto.charAt(izquierda) != texto.charAt(derecha)) {
                System.out.println("La palabra " + texto + " NO es palíndroma.");
                esPalindromo = false;
                break;
            }
            izquierda++;
            derecha--;
        }

        if (esPalindromo) {
            System.out.println("La palabra " + texto + " es palíndroma.");
        }
    }
}
