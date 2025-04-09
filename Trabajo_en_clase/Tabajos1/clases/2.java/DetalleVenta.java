import java.util.ArrayList;
import java.util.List;

public class DetalleVenta {

    IProducto producto;
    private int cantidad;
    private double precioUnitario;

public DetalleVenta(IProducto producto,int cantidad){
    this.cantidad=cantidad;
    this.producto=producto;
    this.precioUnitario=producto.getPrecio();
}

public double getPrecioUnitario(){
    return precioUnitario;
}

public IProducto getProducto (){
    return producto;
}

    
}

