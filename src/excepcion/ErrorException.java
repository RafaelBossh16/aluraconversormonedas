package excepcion;

public class ErrorException extends RuntimeException {
    private String mensaje;

    public ErrorException(String mensaje)
    {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage(){
        return this.mensaje;
    }

}
