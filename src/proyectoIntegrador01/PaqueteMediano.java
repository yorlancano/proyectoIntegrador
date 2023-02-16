package proyectoIntegrador01;

public class PaqueteMediano extends Paquetes {
    double peso = 8.5;
    int precio = 40000;
    String identifacion = "ije320";

    @Override
    public void caracteristicasPaquetes() {
        System.out.println("paquete mediano: " +
                "\npeso: " + peso +
                "\nprecio: " + precio +
                "\nidentificacion: " + identifacion);
    }
}
