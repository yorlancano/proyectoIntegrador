package proyectoIntegrador01;

public class RecibirPaquete {
    private String numeroGuia = "234-tru";
    private String ciudadDestino = "manizales";
    private String direccionDestino = "cr1-5b23";
    private String nombrePersonaRecibe = "alejandro";
    private long numeroCelularRecibe = 1234567890;
    private String horaEntrega = "8:30pm";
    //private String estadoEnvio = "entregado y recibido";
    private double valorEnvio = 20000;

    RecibirPaquete(){}

    @Override
    public String toString() {
        return "Recibe el paquete: " +
                "\n-numeroGuia='" + numeroGuia +
                "\n-ciudadDestino='" + ciudadDestino +
                "\n-direccionDestino='" + direccionDestino +
                "\n-nombrePersonaRecibe='" + nombrePersonaRecibe +
                "\n-numeroCelularRecibe=" + numeroCelularRecibe +
                "\n-horaEntrega='" + horaEntrega +
                "\n-valorEnvio=" + valorEnvio ;
    }
}
