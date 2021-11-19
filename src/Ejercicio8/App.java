package Ejercicio8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Programa para determinar si un dia es laboral o no");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dia de la semana");
        String dia = entrada.nextLine().toLowerCase();
        entrada.close();
        
        switch(dia){
            case "lunes":
                System.out.println(dia+" es laboral");
                break;
            case "martes":
                System.out.println(dia+" es laboral");
                break;
            case "miercoles":
                System.out.println(dia+" es laboral");
                break;
            case "jueves":
                System.out.println(dia+" es laboral");
                break;
            case "viernes":
                System.out.println(dia+" es laboral");
                break;
            case "sabado":
                System.out.println(dia+" no es laboral");
                break;
            case "domingo":
                System.out.println(dia+" no es laboral");
                break;
            default:
                System.out.println(dia+" no es un día pero probablemente sea laboral");
                break;
        }
    }
}
