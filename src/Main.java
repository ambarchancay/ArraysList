// Main.java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        // Agrega instancias de las subclases a la lista
        listaVehiculos.add(new Coche("Coche1"));
        listaVehiculos.add(new Moto("Moto1"));

        // Itera sobre la lista y muestra información sobre cada vehículo
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println("Tipo de Combustible: " + vehiculo.obtenerTipoCombustible());
            System.out.println("------------------");
        }
    }
}





