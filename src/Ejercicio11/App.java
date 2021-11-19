package Ejercicio11;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Programa que cuenta las vocales e indica la longitud de la frase");
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Ingrese la frase:");
        String frase = entrada.nextLine().toLowerCase();
        entrada.close();

        int[] contadorVocales = {0,0,0,0,0};
        char caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            switch (caracter) {
                case 'a':
                    contadorVocales[0] += 1;
                    break;
                case 'e':
                    contadorVocales[1] += 1;
                    break;
                case 'i':
                    contadorVocales[2] += 1;
                    break;
                case 'o':
                    contadorVocales[3] += 1;
                    break;
                case 'u':
                    contadorVocales[4] += 1;
                    break;
                default:
                    break;
            }
        }
        System.out.println("El tamaño de la frase es de " + frase.length() +"\n" +
                            "la cantidad de vocales a es: " + contadorVocales[0] +"\n" +
                            "la cantidad de vocales e es: " + contadorVocales[1] +"\n" +
                            "la cantidad de vocales i es: " + contadorVocales[2] +"\n" +
                            "la cantidad de vocales o es: " + contadorVocales[3] +"\n" +
                            "la cantidad de vocales u es: " + contadorVocales[4]);
    }
}
