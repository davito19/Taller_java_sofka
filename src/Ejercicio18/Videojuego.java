package Ejercicio18;

public class Videojuego implements Entregable{
    
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String company;
    
    public Videojuego() {
        this.horasEstimadas = 10;
        this.entregado = false;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String company) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.company = company;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Videojuego [company=" + company + ", entregado=" + entregado + ", genero=" + genero
                + ", horasEstimadas=" + horasEstimadas + ", titulo=" + titulo + "]";
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        Videojuego b = (Videojuego) a; 
        return b.getHorasEstimadas() - this.horasEstimadas;
    }    
}
