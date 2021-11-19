package Ejercicio15;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        while (true){
            System.out.println("****** Gestión Cinematográfica ******");
            System.out.println("1. Nuevo actor");
            System.out.println("2. Buscar actor");
            System.out.println("3. Eliminar actor");
            System.out.println("4. Modificar actor");
            System.out.println("5. Ver todos los actores");
            System.out.println("6. Ver películas de los actores");
            System.out.println("7. Ver categoría de las películas de los actores");
            System.out.println("8. SALIR");
            System.out.print("Digite alguna de las opciones anteriores: ");
            opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion){
                case 1: continue;
                case 2: continue;
                case 3: continue;
                case 4: continue;
                case 5: continue;
                case 6: continue;
                case 7: continue;
                case 8: 
                    entrada.close();
                    return;
             }
        }
    }
}
