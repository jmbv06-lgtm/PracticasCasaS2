package sw11;

public class Videojuego {
    // Atributos public
    public String nombre;
    public String genero;

    // Atributos con acceso por defecto
    String version;
    boolean activo;

    // Métodos public
    public void mostrarInformacion() {
        System.out.println("Videojuego: " + nombre
                + " | Género: " + genero
                + " | Versión: " + version
                + " | Activo: " + activo);
    }

    public void iniciar() {
        activo = true;
        System.out.println("Iniciando " + nombre);
    }

    // Métodos con acceso por defecto
    void cerrar() {
        activo = false;
        System.out.println("Cerrando " + nombre);
    }

    void mostrarVersion() {
        System.out.println("Versión de " + nombre + ": " + version);
    }
}