package Ejercicio16;

public class Persona {
    
    private String nombre = "";
    private int edad = 0;
    private String dni = this.generaDNI();
    private char sexo = 'M';
    private double peso = 0;
    private double altura = 0;
    
    public Persona() {
        
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = this.comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
        double IMC = this.peso/(Math.pow(this.altura, 2));
        if(IMC < 20) return -1;
        if(IMC >= 20 && IMC <= 25) return 0;
        return 1;
    }
    
    public boolean esMayorDeEdad(){
        if(this.edad >= 18) return true;
        return false;
    }

    private char comprobarSexo(char Sexo){
        if(Sexo == 'M' || Sexo == 'H') return Sexo;
        return 'H';
    }

    @Override
    public String toString() {
        return "Persona [altura=" + altura + ", dni=" + dni + ", edad=" + edad + ", nombre=" + nombre + ", peso=" + peso
                + ", sexo=" + sexo + "]";
    }
    
    private String generaDNI(){

        //Para este proceso, se hizo uso del método de generación de DNI implementado en España
        int num = (int)(Math.random() * 9.0E7D) + 10000000;
        int resto = num % 23;
        String[] Letras = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        String DNI = String.valueOf(num).concat(Letras[resto]);
        this.dni = DNI;
        return DNI;
    }


}

