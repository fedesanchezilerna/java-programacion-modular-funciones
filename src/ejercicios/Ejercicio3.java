/*
 * Ejercicio3 10/16/2024
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
 * Calcula el cubo de un número
 */
public class Ejercicio3 {

    public static void ejercicio3() {
        System.out.print("Introduce un número para calcular su cubo: ");
        int numero = Integer.parseInt(ScannerUtils.getScanner().nextLine());
        System.out.println("El cubo de " + numero + " es " + calcularCubo(numero));
    }

    private static int calcularCubo(int num) {
        return num * num * num;
    }
}