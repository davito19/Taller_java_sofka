package Ejercicio14;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Programa para contar de 2 en 2 hasta mil partiendo de cualquier numero");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numeroInicial = Integer.parseInt(entrada.nextLine());
        entrada.close();

        System.out.println("Empieza la cuenta");
        for(int i = numeroInicial; i<=1000; i+=2) System.out.println(i);
        System.out.println("Termina la cuenta");
    }
}
