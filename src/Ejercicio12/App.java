package Ejercicio12;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Programa para comparar palabras");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra:");
        String primeraFrase = entrada.nextLine();
        System.out.println("Ingrese la segunda palabra:");
        String segundaFrase =  entrada.nextLine();
        entrada.close();

        if(primeraFrase == segundaFrase) System.out.println("Son iguales");
        else {
            if(primeraFrase.length() != segundaFrase.length()) System.out.println("Las palabras no tienen el mismo tamaño");
            else{
                char letra1;
                char letra2;
                for (int i = 0; i < primeraFrase.length(); i++) {
                    letra1 = primeraFrase.charAt(i);
                    letra2 = segundaFrase.charAt(i);
    
                    if(letra1 != letra2){
                        System.out.println("¡Diferencia encontrada!");
                        System.out.println("En el índice "+ i +", en la palabra "+ primeraFrase +" encontramos la" +
                                " letra "+ letra1 +", mientras que en la palabra "+segundaFrase +" tenemos a la" +
                                " letra "+ letra2 +". Por lo tanto, estas palabras NO son iguales.");      
                    }           
                }
            }
        }
    }
}
