package zapateria;
class Zapatilla extends Zapato implements Oferta {
    private String marca;

    public Zapatilla(String nombre, double precio, int stock, String marca) {
        super(nombre, precio, stock);
        this.marca = marca;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Zapatilla - Marca: " + marca);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Stock: " + getStock());
    }

    @Override
    public void calcularDescuento(int porcentaje) {
        super.calcularDescuento(porcentaje);
    }
}