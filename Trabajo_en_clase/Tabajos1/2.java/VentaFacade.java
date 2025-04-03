import java.util.Scanner;

public class VentaFacade {
    private Venta venta;
    private Scanner scanner = new Scanner(System.in);

    public void iniciarVenta() {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la fecha: ");
        String fecha = scanner.nextLine();
        System.out.print("Ingrese el tipo de documento (DNI/CI): ");
        String tipoDocumento = scanner.nextLine();
        System.out.print("Ingrese el número de documento: ");
        String numeroDocumento = scanner.nextLine();

        venta = new Venta(nombre, fecha, tipoDocumento, numeroDocumento);
    }

    public void agregarProducto() {
        System.out.print("Tipo de producto (simple/compuesto): ");
        String tipo = scanner.nextLine();
        System.out.print("Descripción del producto: ");
        String descripcion = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); 

        IDetalleVenta producto = ProductoFactory.crearProducto(tipo, descripcion, precio, cantidad);
        if (producto != null) {
            venta.agregarDetalle(producto);
            System.out.println("✅ Producto agregado.");
        } else {
            System.out.println("❌ Tipo de producto inválido.");
        }
    }

    public void finalizarVenta() {
        venta.mostrarVenta();
    }
}
