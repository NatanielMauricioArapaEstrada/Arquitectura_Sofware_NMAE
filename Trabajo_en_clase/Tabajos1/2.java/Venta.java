import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String nombre;
    private String fecha;
    private String tipoDocumento;
    private String numeroDocumento;
    private List<IDetalleVenta> detalles = new ArrayList<>();

    public Venta(String nombre, String fecha, String tipoDocumento, String numeroDocumento) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public void agregarDetalle(IDetalleVenta detalle) {
        detalles.add(detalle);
    }

    public void mostrarVenta() {
        System.out.println("\n===== DETALLE DE LA VENTA =====");
        System.out.println("Cliente: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Documento: " + tipoDocumento + " - " + numeroDocumento);
        System.out.println("\nProductos:");
        double total = 0;
        for (IDetalleVenta d : detalles) {
            System.out.println("- " + d.getDescripcion() + " | Precio: $" + d.getPrecio());
            total += d.getPrecio();
        }
        System.out.println("\n💲 Total a pagar: $" + total);
    }
}
