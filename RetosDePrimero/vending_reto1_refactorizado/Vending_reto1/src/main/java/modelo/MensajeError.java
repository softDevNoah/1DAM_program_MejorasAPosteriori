package modelo;

public class MensajeError {

    private static final String NO_EXISTE = "Este elemento no existe";
    private static final String YA_EXISTE = "Este elemento ya existe";
    private static final String DATO_INCORRECTO = "Dato incorrecto";
    private static final String AFORO_LLENO = "No quedan plazas disponibles";
    private static final String VACIO = "No has introducido ningún dato";
    private static final String MUY_LARGO = "Has superado el nº de caracteres máximo";
    private static final String MUY_CORTO = "No has alcanzado el nº mínimo de caracteres";

    private static final String CONEXION_SERVIDOR_BD = "No se pudo conectar con el servidor de la base de datos";
    private static final String ERROR_BD = "Ha ocurrido un error inesperado relacionado con la base de datos";
    private static final String CIERRE_BD = "No se ha podido cerrar la conexión con el servidor de la base de datos";

    public String getNoExiste() {
        return NO_EXISTE;
    }

    public String getYaExiste() {
        return YA_EXISTE;
    }

    public String getDatoIncorrecto() {
        return DATO_INCORRECTO;
    }

    public String getAforoLleno() {
        return AFORO_LLENO;
    }

    public String getVacio() {
        return VACIO;
    }

    public String getMuyLargo() {
        return MUY_LARGO;
    }

    public String getMuyCorto() {
        return MUY_CORTO;
    }

    public String getConexionServidorBD() {
        return CONEXION_SERVIDOR_BD;
    }

    public String getErrorBD() {
        return ERROR_BD;
    }

    public String getCierreBD() {
        return CIERRE_BD;
    }
}
