package proyectoIntegrador01;

public class PaquetePequeño extends Paquetes {

    double peso = 4.5;
    int precio = 20000;
    String identifacion = "ice420";

    @Override
    public void caracteristicasPaquetes() {
        System.out.println("paquete pequeño: " +
                            "\npeso: " + peso +
                            "\nprecio: " + precio +
                            "\nidentificacion: " + identifacion);
    }
}
