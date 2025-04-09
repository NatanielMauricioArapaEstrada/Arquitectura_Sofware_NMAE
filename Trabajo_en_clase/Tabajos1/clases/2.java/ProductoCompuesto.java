import java.util.ArrayList;
import java.util.List;

public class ProductoCompuesto implements IProducto {
    private String descripcion;
    private List<IProducto> productos = new ArrayList<>();

    public ProductoCompuesto(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (IProducto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }
}
