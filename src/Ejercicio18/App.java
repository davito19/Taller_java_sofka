package Ejercicio18;

public class App {
    public static void main(String[] args) {
        Serie[] series = {new Serie("halo", "bungie"),new Serie("halo2", "bungie"),
                        new Serie(),new Serie("halo3", "bungie"), new Serie("haloe", 5, "ficcion", "bungie")};
        Videojuego [] videojuegos = {new Videojuego(),new Videojuego(), new Videojuego(),
                                    new Videojuego("halo infinite", 68), new Videojuego("halo infinite expansion", 100)};
        videojuegos[1].entregar();
        videojuegos[4].entregar();
        series[4].entregar();
        series[0].entregar();
        
        int cantidadSeries = 0;
        int cantidadVideojuegos = 0;
        for (int i = 0; i < videojuegos.length; i++) {
            if(videojuegos[i].isEntregado()) {
                cantidadVideojuegos++;
                videojuegos[i].devolver();
            }
            if(series[i].isEntregado()) {
                cantidadSeries++;
                series[i].devolver();
            }
        }

        int [] posicion = {0,0};
        int aux;
        for (int i = 0; i < videojuegos.length; i++) {
            for (Videojuego videojuego : videojuegos) {
                aux = videojuego.compareTo(videojuegos[i]);
                if (aux > posicion[0]) {
                    posicion[0] = aux;
                    posicion[1] = i;
                }
            }
        }
        System.out.println("La cantidad de series prestadas es de:" + cantidadSeries);
        System.out.println("La cantidad de videojuegos prestados es de:" + cantidadVideojuegos);
        System.out.println(videojuegos[posicion[1]]);
    }
}
