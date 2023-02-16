package proyectoIntegrador01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("si eres empleado digite 1 de lo contrario digite 2 para cliente");
        String opcion = scanner.next();
        if(opcion.startsWith("1")){
            DatosCliente traerDatosEmpleado = CreacionPaquete.traerEmpleado();
            System.out.println(traerDatosEmpleado.carcateristicasCliete());
        } else if (opcion.startsWith("2")) {
            DatosCliente traerDatosCliente = CreacionPaquete.traerCliente();
            System.out.println(traerDatosCliente.carcateristicasCliete());
            System.out.println();
            Paquetes armarPaquete = CreacionPaquete.escogerPaquetes("grande");
            armarPaquete.caracteristicasPaquetes();
            System.out.println();
            RecibirPaquete recibirPaquete = new RecibirPaquete();
            System.out.println(recibirPaquete.toString());
        }

    }
}