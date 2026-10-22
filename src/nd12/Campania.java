package nd12;

public class Campania {
    // Atributos public
    public String nombre;
    public double presupuesto;

    // Atributos con acceso por defecto (sin escribir modificador)
    String plataforma;
    boolean activa;

    // Métodos public
    public void mostrarInformacion() {
        System.out.println("Campaña: " + nombre
                + " | Plataforma: " + plataforma
                + " | Presupuesto: $" + presupuesto
                + " | Activa: " + activa);
    }

    public void activar() {
        activa = true;
    }

    // Métodos con acceso por defecto
    void desactivar() {
        activa = false;
    }

    void mostrarPresupuesto() {
        System.out.println("Presupuesto de " + nombre + ": $" + presupuesto);
    }
}