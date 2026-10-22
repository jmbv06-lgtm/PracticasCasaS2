package sw11;

public class Main {
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego();
        Videojuego juego3 = new Videojuego();

        juego1.nombre = "Minecraft";
        juego1.genero = "Aventura";
        juego1.version = "1.20";

        juego2.nombre = "FIFA";
        juego2.genero = "Deportes";
        juego2.version = "24.0";

        juego3.nombre = "Hades";
        juego3.genero = "Acción";
        juego3.version = "1.38";

        // Inicio solo el juego 2
        juego2.iniciar();

        juego1.mostrarInformacion();
        juego2.mostrarInformacion();
        juego3.mostrarInformacion();

        juego1.mostrarVersion();

        juego2.cerrar();
        juego2.mostrarInformacion();
    }
}