package proyectoIntegrador01;

public class Usuario extends DatosCliente{
    private long cedula = 1233454454;
    private String nombre = "yorlan";
    private String apellidos = "marroquin";
    private long celular = 1234234000;
    private String correoElectronico = "yorlan.marroquin@unac.edu.co";
    private String direccionResidencia = "cr1-5a13";
    private String ciudad = "medellin";



    @Override
    public String carcateristicasCliete() {
        return "proyectoIntegrador01.Usuario:" +
                "\n-cedula=" + cedula +
                "\n-nombre='" + nombre + '\'' +
                "\n-apellidos='" + apellidos + '\'' +
                "\n-celular='" + celular + '\'' +
                "\n-correoElectronico='" + correoElectronico + '\'' +
                "\n-direccionResidencia='" + direccionResidencia + '\'' +
                "\n-ciudad='" + ciudad + '\'' ;
    }
}

