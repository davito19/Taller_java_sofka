package Ejercicio5;

public class App {
    public static void main(String[] args) {
        int contador = 1;
        System.out.println("Numeros Pares del 1 al 100");
        while(contador<=50){
            System.out.print(2*contador+", ");
            contador++;
        }
        System.out.println();
        contador = 0;
        System.out.println("Numeros impares del 1 al 100");
        while(contador<50){
            System.out.print((2*contador+1)+", ");
            contador++;
        }
        System.out.println();
    }
}
