public class ProductoFactory {
    public static IDetalleVenta crearProducto(String tipo, String descripcion, double precio, int cantidad) {
        if (tipo.equalsIgnoreCase("simple")) {
            return new ProductoSimple(descripcion, precio, cantidad);
        }
        return null;
    }
}
