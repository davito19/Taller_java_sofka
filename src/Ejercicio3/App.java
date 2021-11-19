package Ejercicio3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Programa para calcular el area de un circulo");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo en cm:");
        double radio = Double.parseDouble(entrada.next());
        entrada.close();
        System.out.println("El area de la circunferencia es:" + Math.PI*Math.pow(radio, 2));
    }
}
