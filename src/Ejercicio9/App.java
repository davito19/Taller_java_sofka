package Ejercicio9;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println("Programa para el manejo de cadenas");
        System.out.println("la frase es:\n"+texto);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su frase complemantaria");
        String frase = entrada.nextLine();
        entrada.close();
        texto = texto.replaceAll("a", "e") +" "+ frase;
        System.out.println("el texto es:\n"+texto);
    }
}
