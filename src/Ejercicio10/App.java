package Ejercicio10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Programa que elimina los espacios en blanco");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = entrada.nextLine();
        frase = frase.replace(" ", "");
        entrada.close();
        System.out.println("La nueva frase sin espacio es:\n"+frase);
    }    
}
