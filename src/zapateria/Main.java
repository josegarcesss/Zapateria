package zapateria;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static Zapato pedirDatos(String tipo) throws InputMismatchException, Exception {
        Zapato zapato = null;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese precio: ");
        double precio = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese stock: ");
        int stock = leer.nextInt();
        leer.nextLine();
        switch (tipo) {
            case "Zapatilla":
               System.out.println("Ingrese marca: ");
               String marca = leer.nextLine();
               zapato = new Zapatilla(nombre, precio, stock, marca);
               break;
            case "Sandalia":
               System.out.println("Ingrese estilo: ");
                String estilo = leer.nextLine();
                zapato = new Sandalia(nombre, precio, stock, estilo);
                break;
            case "Bota":
               System.out.println("Ingrese talla: ");
               int talla = leer.nextInt();
                leer.nextLine();
                zapato = new Bota(nombre, precio, stock, talla);
                break;
          }
           return zapato;
        }

    public static void main(String[] args) {
        Zapateria zapateria = new Zapateria();
        
        try {
            System.out.println("Ingrese datos de las Zapatilla");
            Zapato zapatilla = pedirDatos("Zapatilla");
            zapateria.agregarZapato(zapatilla);
            System.out.println("||||||||||||||||||||||||||||||");            
            System.out.println("Ingrese datos de las Sandalias");
            Zapato sandalia = pedirDatos("Sandalia");
            zapateria.agregarZapato(sandalia);
            System.out.println("||||||||||||||||||||||||||||||");            
            System.out.println("Ingrese datos de las Botas");
            Zapato bota = pedirDatos("Bota");
            zapateria.agregarZapato(bota);
            System.out.println("||||||||||||||||||||||||||||||");            
            zapatilla.calcularDescuento(15);
            
            zapateria.ordenarPorPrecio();
            
            zapateria.mostrarInventario();
        } catch (InputMismatchException e) {
            System.out.println("Error de tipo de datos");
        } catch (Exception e) {
            System.out.println("Error general");
        } finally {
            System.out.println("En bloque finally");
        }
    }
}