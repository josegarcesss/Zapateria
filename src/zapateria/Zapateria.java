package zapateria;
import java.util.ArrayList;
import java.util.Collections;

class Zapateria {
    private ArrayList<Zapato> inventario;

    public Zapateria() {
        inventario = new ArrayList<>();
    }

    public void agregarZapato(Zapato zapato) {
        inventario.add(zapato);
    }

    public void mostrarInventario() {
        for (Zapato zapato : inventario) {
            zapato.mostrarInformacion();
            System.out.println("||||||||||||||||");
        }
    }

    public void ordenarPorPrecio() {
        Collections.sort(inventario, (zapato1, zapato2) -> Double.compare(zapato1.getPrecio(), zapato2.getPrecio()));
    }
}
