/*
 * App 10/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import ejercicios.*;
import menu.Menu;
import utils.ScannerUtils;

public class App {

    static int ejercicio;
    static boolean continuar;

    public static void main(String[] args) {
        selectorDeEjercicios();
        ScannerUtils.closeScanner();
    }

    private static void selectorDeEjercicios() {
        do {
            Menu.despliegueMenuPrincipal();
            try {
                ejercicio = ScannerUtils.readInt();
                if (ejercicio == 0) {
                    System.out.println("Fin del programa.");
                    continuar = false;
                    break;
                } else {
                    ejecutarEjercicio(ejercicio);
                    mostrarOpcionesFinEjercicio();
                }
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. Por favor ingrese un número válido.");
            }
        } while (continuar);
    }

    /**
     * Método que se ejecuta el finalizar cada ejercicio.
     * Muestra las opciones de volver al menú o cerrar el programa.
     */
    private static void mostrarOpcionesFinEjercicio() {
        System.out.println("""
                
                ============================================
                Fin del ejercicio.
                0.  Salir del programa
                1.  Volver al menú principal
                ============================================
                """);

        int opcion = ScannerUtils.readInt();  // Leer la opción del usuario + consume salto de línea
        switch (opcion) {
            case 0:
                System.out.println("Fin del programa.");
                continuar = false;
                break;
            case 1:
                continuar = true;
                break;
            default:
                System.out.println("Opción no válida. Volviendo al menú principal.");
                continuar = true;
                break;
        }
    }

    private static void ejecutarEjercicio(int numEjercicio) {
        switch (numEjercicio) {
            case 1:
                Ejercicio1.ejercicio1();
                break;
            case 2:
                Ejercicio2.ejercicio2();
                break;
            case 3:
                Ejercicio3.ejercicio3();
                break;
            case 4:
                Ejercicio4.ejercicio4();
                break;
            case 5:
                Ejercicio5.ejercicio5();
                break;
            case 6:
                Ejercicio6.ejercicio6();
                break;
            case 7:
                Ejercicio7.ejercicio7();
                break;
            case 8:
                Ejercicio8.ejercicio8();
                break;
            case 9:
                Ejercicio9.ejercicio9();
                break;
            case 10:
                Ejercicio10.ejercicio10();
                break;
            case 11:
                Ejercicio11.ejercicio11();
                break;
            case 12:
                Ejercicio12.ejercicio12();
                break;
            default:
                System.out.println("Ejercicio no definido.");
                break;
        }
    }
}
