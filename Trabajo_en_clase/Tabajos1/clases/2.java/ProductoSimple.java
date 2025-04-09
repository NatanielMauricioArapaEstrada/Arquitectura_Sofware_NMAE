public class ProductoSimple implements IProducto {
    private String descripcion;
    private double precio;
    

    public ProductoSimple(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
        
    }

    @Override
    public double getPrecio() {
        return precio ;
    }

    @Override
    public String getDescripcion() {
        return descripcion ;
    }
}
