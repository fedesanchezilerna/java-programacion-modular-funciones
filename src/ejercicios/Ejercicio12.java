/*
 * Ejercicio12 10/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package ejercicios;

import menu.Menu;
import utils.ScannerUtils;

public class Ejercicio12 {

    public static void ejercicio12() {
        Menu.despliegueMenuFigurasGeometricas();
        int figura = ScannerUtils.readInt();
        calculoAreaFiguraGeometrica(figura);
    }

    /**
     * Recibe un int (figura geométrica) y calcula a través
     * de su respectiva función, su área.
     *
     * @param figura la figura geométrica a calcular su area.
     */
    private static void calculoAreaFiguraGeometrica(int figura) {

        switch (figura) {
            case 1:
                System.out.print("Introduce el radio del círculo: ");
                double radio = ScannerUtils.readDouble();
                System.out.println("El área del círculo es: " + areaCirculo(radio));
                break;
            case 2:
                System.out.println("Introduce la base del triángulo: ");
                double base = ScannerUtils.readDouble();
                System.out.println("Introduce la altura del triángulo: ");
                double altura = ScannerUtils.readDouble();
                System.out.println("El área del triángulo es: " + areaTriangulo(base, altura));
                break;
            case 3:
                System.out.print("Introduce el lado del cuadrado: ");
                double lado = ScannerUtils.readDouble();
                System.out.println("El área del cuadrado es: " + areaCuadrado(lado));
                break;
        }
    }

    private static double areaCirculo(double radio) {
        return (radio * radio) * Math.PI;
    }

    private static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    private static double areaCuadrado(double lado) {
        return lado * lado;
    }
}
