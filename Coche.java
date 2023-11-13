// Coche.java
public class Coche extends Vehiculo {
    public Coche(String tipoCombustible) {
        super(tipoCombustible);
    }

    @Override
    public String obtenerTipoCombustible() {
        return super.obtenerTipoCombustible() + " (Gasolina)";
    }
}
