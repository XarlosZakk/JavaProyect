package Entidades;

public enum Estado {
    ACTIVO,
    INACTIVO,
    SUSPENDIDO;

    public static Estado fromString(String value) {
        return Estado.valueOf(value.toUpperCase());
    }
}
