package Ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        System.out.println("Programa para imprimir la hora en formato (AAAA/MM/DD) (HH:MM:SS)");
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime fechaAhora = LocalDateTime.now();
        System.out.println("la hora es: "+formatoFecha.format(fechaAhora));
    }
}
