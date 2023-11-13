// Vehiculo.java
public class Vehiculo {
    private String tipoCombustible;

    public Vehiculo(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String obtenerTipoCombustible() {
        return tipoCombustible;
    }
}