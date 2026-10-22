package nt11;

public class Main {
    public static void main(String[] args) {
        EquipoRed router = new EquipoRed();
        EquipoRed switch1 = new EquipoRed();
        EquipoRed accessPoint = new EquipoRed();

        router.nombre = "RouterCentral";
        router.direccionIP = "192.168.1.1";
        router.tipo = "Router";

        switch1.nombre = "SwitchPiso1";
        switch1.direccionIP = "192.168.1.2";
        switch1.tipo = "Switch";

        accessPoint.nombre = "AP-Sala";
        accessPoint.direccionIP = "192.168.1.3";
        accessPoint.tipo = "Access Point";

        // Conecto el router y el access point
        router.conectar();
        accessPoint.conectar();

        router.mostrarEstado();
        switch1.mostrarEstado();
        accessPoint.mostrarEstado();

        router.mostrarInformacion();

        router.desconectar();
        router.mostrarEstado();
    }
}