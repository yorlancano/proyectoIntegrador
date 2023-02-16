package proyectoIntegrador01;

public class PaqueteGrande extends Paquetes {
    double peso = 12.5;
    int precio = 80000;
    String identifacion = "tre4230";

    @Override
    public void caracteristicasPaquetes() {
        System.out.println("paquete grande: " +
                "\npeso: " + peso +
                "\nprecio: " + precio +
                "\nidentificacion: " + identifacion);
    }
}
