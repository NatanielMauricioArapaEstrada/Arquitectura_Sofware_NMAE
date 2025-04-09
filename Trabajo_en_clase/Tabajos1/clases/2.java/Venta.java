import java.util.ArrayList;
import java.util.List;

public class Venta {
    
    private String fecha;
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;
    private String nombreCliente;
    private List<DetalleVenta> detalles = new ArrayList<>();
    private IPago tipoPago;
    

    public Venta(String nombreCliente, String fecha, TipoDocumento tipoDocumento, String numeroDocumento) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public void agregarProducto(IProducto producto,int cantidad) {
        DetalleVenta detalleVenta=new DetalleVenta(producto, cantidad)
        detalles.add(detalleVenta);
    }

    public void mostrarVenta() {
        System.out.println("\n===== DETALLE DE LA VENTA =====");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Documento: " + tipoDocumento + " - " + numeroDocumento);
        System.out.println("\nProductos:");
        double total = 0;
        for (DetalleVenta d : detalles) {
            System.out.println("- " + d.getProducto().getDescripcion() + " | Precio: $" + d.getProducto().getPrecio());
            total += d.getProducto().getPrecio();
        }
        System.out.println("\n💲 Total a pagar: $" + total);
    }
}
