/*
 * Ejercicio4 10/16/2024
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
 * Calcula el menor de dos números
 */
public class Ejercicio4 {

    public static void ejercicio4() {

        // Solicitar dos números
        System.out.print("Ingrese el primer número: ");
        double numero1 = Double.parseDouble(ScannerUtils.getScanner().nextLine());
        System.out.print("Ingrese el Segundo número: ");
        double numero2 = Double.parseDouble(ScannerUtils.getScanner().nextLine());

        // Calcular y Mostrar resultado
        System.out.println("El número menor es: " + menorDeDosNumeros(numero1, numero2));
    }

    private static double menorDeDosNumeros(double num1, double num2) {
        return Math.min(num1, num2);
    }

}
