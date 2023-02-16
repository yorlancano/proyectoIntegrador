package proyectoIntegrador01;

public class Empleado extends DatosCliente {
    private long cedula = 1302350000;
    private String nombre = "marcos";
    private String apellidos = "cano";
    private long celular = 1111111000;
    private String correoElectronico = "cano@unac.edu.co";
    private String direccionResidencia = "84-a32";
    private String ciudad = "gigante";
    private int añosTrabajo = 18;
    private String tipoSangre = "b+";
    private String tipoEmpleado = "gerente";


    @Override
    public String carcateristicasCliete() {

        return "proyectoIntegrador01.Empleado:" +
                "\n-cedula=" + cedula +
                "\n-nombre='" + nombre + '\'' +
                "\n-apellidos='" + apellidos + '\'' +
                "\n-celular=" + celular +
                "\n-correoElectronico='" + correoElectronico + '\'' +
                "\n-direccionResidencia='" + direccionResidencia + '\'' +
                "\n-ciudad='" + ciudad + '\'' +
                "\n-añosTrabajo=" + añosTrabajo +
                "\n-tipoSangre='" + tipoSangre + '\'' +
                "\n-tipoEmpleado='" + tipoEmpleado + '\'' ;
    }
}
