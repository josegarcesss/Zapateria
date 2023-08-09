package zapateria;
abstract class Zapato {
    private String nombre;
    private double precio;
    private int stock;

    public Zapato(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract void mostrarInformacion();

    public void calcularDescuento(int porcentaje) {
        double descuento = precio * porcentaje / 100;
        precio -= descuento;
        System.out.println("Descuento aplicado: " + porcentaje + "%");
    }
}