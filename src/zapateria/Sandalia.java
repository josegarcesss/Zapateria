package zapateria;
class Sandalia extends Zapato {
    private String estilo;

    public Sandalia(String nombre, double precio, int stock, String estilo) {
        super(nombre, precio, stock);
        this.estilo = estilo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Sandalia - Estilo: " + estilo);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Stock: " + getStock());
    }
}
