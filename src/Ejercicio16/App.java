package Ejercicio16;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String nombre;
        int edad;
        char genero;
        double peso, altura;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el nombrea: ");
        nombre = entrada.nextLine();
        System.out.print("Digite Su edad: ");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el género de esta persona: ");
        System.out.println("F -> Femenino");
        System.out.println("M -> Masculino");
        System.out.print("Teclé alguna de las tres letras anteriores: ");
        genero = entrada.nextLine().charAt(0);
        System.out.print("Digite la altura en metros: ");
        altura = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite el peso de esta persona en kilogramos: ");
        peso = Double.parseDouble(entrada.nextLine());
        entrada.close();

        Persona persona1 = new Persona(nombre, edad, genero, peso, altura);
        Persona persona2 = new Persona(nombre, edad, genero);
        Persona persona3 = new Persona();
        persona3.setNombre("David Bonett");
        persona3.setEdad(21);
        persona3.setSexo('M');
        persona3.setAltura(1.85);
        persona3.setPeso(70);

        System.out.println(persona1.calcularIMC());
        System.out.println(persona1.esMayorDeEdad());
        System.out.println(persona2.calcularIMC());
        System.out.println(persona2.esMayorDeEdad());
        System.out.println(persona3.calcularIMC());
        System.out.println(persona3.esMayorDeEdad());

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }
}
