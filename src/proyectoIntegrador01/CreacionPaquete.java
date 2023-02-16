package proyectoIntegrador01;

public class CreacionPaquete {
    public static DatosCliente traerCliente(){
        return new Usuario();
    }
    public static DatosCliente traerEmpleado(){
        return new Empleado();
    }
    public static Paquetes escogerPaquetes(String tamañoPaquete){
        if(tamañoPaquete.startsWith("pequeño")){
            return new PaquetePequeño();
        } else if (tamañoPaquete.startsWith("mediano")) {
            return  new PaqueteMediano();
        } else if (tamañoPaquete.startsWith("grande")) {
            return  new PaqueteGrande();
        }
        return null;
    }
}
