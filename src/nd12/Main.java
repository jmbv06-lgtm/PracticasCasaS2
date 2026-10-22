package nd12;

public class Main {
    public static void main(String[] args) {
        Campania campania1 = new Campania();
        Campania campania2 = new Campania();
        Campania campania3 = new Campania();

        campania1.nombre = "Verano Instagram";
        campania1.presupuesto = 500.0;
        campania1.plataforma = "Instagram";

        campania2.nombre = "Baile TikTok";
        campania2.presupuesto = 300.5;
        campania2.plataforma = "TikTok";

        campania3.nombre = "Ofertas Facebook";
        campania3.presupuesto = 750.0;
        campania3.plataforma = "Facebook";

        // Cambio el estado de SOLO una campaña
        campania2.activar();

        campania1.mostrarInformacion();
        campania2.mostrarInformacion();
        campania3.mostrarInformacion();

        campania2.mostrarPresupuesto();
        campania2.desactivar();
        System.out.println("Campaña 2 activa: " + campania2.activa);
    }
}