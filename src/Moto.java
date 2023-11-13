// Moto.java
public class Moto extends Vehiculo {
    public Moto(String tipoCombustible) {
        super(tipoCombustible);
    }

    @Override
    public String obtenerTipoCombustible() {
        return super.obtenerTipoCombustible() + " (Gasolina)";
    }
}