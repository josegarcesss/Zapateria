package zapateria;
class Bota extends Zapato {
    private int Talla;

    public Bota(String nombre, double precio, int stock, int talla) {
        super(nombre, precio, stock);
        this.Talla = talla;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Bota - Talla: " + Talla);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Stock: " + getStock());
    }
}
