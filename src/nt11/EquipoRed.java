package nt11;

public class EquipoRed {
    // Atributos public
    public String nombre;
    public String direccionIP;

    // Atributos con acceso por defecto
    String tipo;
    boolean conectado;

    // Métodos public
    public void conectar() {
        conectado = true;
        System.out.println(nombre + " conectado.");
    }

    public void mostrarInformacion() {
        System.out.println("Equipo: " + nombre
                + " | IP: " + direccionIP
                + " | Tipo: " + tipo
                + " | Conectado: " + conectado);
    }

    // Métodos con acceso por defecto
    void desconectar() {
        conectado = false;
        System.out.println(nombre + " desconectado.");
    }

    void mostrarEstado() {
        if (conectado) {
            System.out.println(nombre + " está CONECTADO.");
        } else {
            System.out.println(nombre + " está DESCONECTADO.");
        }
    }
}