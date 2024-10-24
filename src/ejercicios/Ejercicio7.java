/*
 * Ejercicio7 10/16/2024
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
 * Contador de los dígitos de un número
 */
public class Ejercicio7 {

    public static void ejercicio7() {
        int numero = numeroEnteroPositivo();
        contadorDigitos(numero);
    }

    // Método para obtener un número entero positivo
    private static int numeroEnteroPositivo() {
        int num = 0;
        boolean valido;
        do {
            System.out.print("Ingresa un número entero positivo: ");
            String input = ScannerUtils.getScanner().nextLine();
            try {
                num = Integer.parseInt(input);  // Intenta convertir el String a entero
                valido = num > 0;  // Verificación de nro positivo
                if (!valido) {
                    System.out.println("Número no válido. Debe ser un número positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Número no válido. Ingresa un número nuevamente.");
                valido = false;
            }
        } while (!valido);
        return num;
    }

    // Cuenta y muestra dígitos de un número
    private static void contadorDigitos(int num) {
        int digitos = 0;
        while (num > 0) {
            digitos++;
            num /= 10;
        }
        System.out.println("Cantidad de dígitos del número ingresado: " + digitos);
    }
}
