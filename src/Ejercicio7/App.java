package Ejercicio7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Programa para determinar si un numero es mayor o igual a cero");
        Scanner entrada = new Scanner(System.in);
        double numero;
        do{
            System.out.println("Ingrese un numero mayor o igual a cero");
            numero = Double.parseDouble(entrada.nextLine());
            if(numero>=0) break;
        }while(true);
        entrada.close();
        System.out.println("El numero ingresado fue:"+ numero);
    }
}
