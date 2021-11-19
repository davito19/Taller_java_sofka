package Ejercicio2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Ingrese dos valores numericos por consolo y determinar cual es mayor");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        double numero1 = Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese el segundo valor");
        double numero2 = Double.parseDouble(entrada.nextLine());
        entrada.close();        if(numero1 == numero2)  System.out.println("las variables son iguales");
        else if(numero1 > numero2)  System.out.println("Numero 1 mayor a Numero 2");
        else  System.out.println("Numero 2 mayor a numero 1");

        
    }
}
