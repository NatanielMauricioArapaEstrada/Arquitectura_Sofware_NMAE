public class ProductoFactory {
    public static IProducto crearProducto(String tipo, String descripcion, double precio, int cantidad) {
        if (tipo.equalsIgnoreCase("simple")) {
            return new ProductoSimple(descripcion, precio, cantidad);
        }
        return null;
    }
}
