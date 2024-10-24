/*
 * Ejercicio1 10/16/2024
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
 * Calcula la suma de dos dígitos
 */
public class Ejercicio1 {

    public static void ejercicio1() {
        System.out.print("Escribe el primer número: ");
        double num1 = Double.parseDouble(ScannerUtils.getScanner().nextLine());

        System.out.print("Escribe el segundo número: ");
        double num2 = Double.parseDouble(ScannerUtils.getScanner().nextLine());

        System.out.println("El resultado de la suma es: " + sumaDouble(num1, num2));
    }

    private static double sumaDouble(double num1, double num2) {
        return num1 + num2;
    }
}
