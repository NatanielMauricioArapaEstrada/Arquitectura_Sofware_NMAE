public class ProductoSimple implements IDetalleVenta {
    private String descripcion;
    private double precio;
    private int cantidad;

    public ProductoSimple(String descripcion, double precio, int cantidad) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public double getPrecio() {
        return precio * cantidad;
    }

    @Override
    public String getDescripcion() {
        return descripcion + " (x" + cantidad + ")";
    }
}
