// Main.java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> listaFiguras = new ArrayList<>();

        // Agrega instancias de las subclases a la lista
        listaFiguras.add(new Circulo("Círculo 1", 5.0));
        listaFiguras.add(new Rectangulo("Rectángulo 1", 4.0, 6.0));

        // Itera sobre la lista y muestra información sobre cada figura
        for (Figura figura : listaFiguras) {
            System.out.println("Nombre: " + figura.getNombre());
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("------------------");
        }
    }
}