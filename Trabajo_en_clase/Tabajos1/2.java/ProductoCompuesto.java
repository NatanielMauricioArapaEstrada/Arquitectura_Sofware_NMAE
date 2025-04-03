import java.util.ArrayList;
import java.util.List;

public class ProductoCompuesto implements IDetalleVenta {
    private String descripcion;
    private List<IDetalleVenta> productos = new ArrayList<>();

    public ProductoCompuesto(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarProducto(IDetalleVenta producto) {
        productos.add(producto);
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (IDetalleVenta p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    @Override
    public String getDescripcion() {
        StringBuilder sb = new StringBuilder(descripcion + " (compuesto de):\n");
        for (IDetalleVenta p : productos) {
            sb.append("  - ").append(p.getDescripcion()).append("\n");
        }
        return sb.toString();
    }
}
