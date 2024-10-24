/*
 * Menu 10/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package menu;

public class Menu {

    public static void despliegueMenuPrincipal(){
        System.out.println("""
                
                ============================================
                MENÚ PRINCIPAL
                Seleccione un ejercicio:
                
                1.  Calcula la Suma de dos números.
                2.  Calcula el Factorial de un número.
                3.  Calcula el cubo de un número.
                4.  Calcula el menor de dos números.
                5.  Muestra si es negativo, positivo o cero.
                6.  Calcula suma de los dígitos de un número.
                7.  Contador de los dígitos de un número.
                8.  Conversor Euros.
                9.  Comprobar número primo.
                10. Número base decimal a binario.
                11. Comprobar palabra palíndroma.
                12. Cálculo de figuras geométricas.
                
                0.  Salir del programa.
                ============================================
                """);
    }

    public static void despliegueMenuDivisas() {
        System.out.println("""
                ============================================
                DIVISAS
                Selecciona la opción a convertir:
                1. Dólares
                2. Yenes
                3. Libras
                ============================================""");
    }

    public static void despliegueMenuFigurasGeometricas() {
        System.out.println("""
                ============================================
                FIGURAS GEOMÉTRICAS
                Selecciona el area a calcular:
                1. Círculo
                2. Triángulo
                3. Cuadrado
                ============================================""");
    }
}
