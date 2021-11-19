package Ejercicio4;

import java.util.Scanner;

public class App {

    final static double iva = 1.21;

    public static void main(String[] args) {
        System.out.println("Programa para calcular el precio final con iva");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el precio base del producto");
        double precioBase = Double.parseDouble(entrada.nextLine());
        entrada.close();

        System.out.println("El precio final del producto es de:" + precioBase*iva);

    }
}
