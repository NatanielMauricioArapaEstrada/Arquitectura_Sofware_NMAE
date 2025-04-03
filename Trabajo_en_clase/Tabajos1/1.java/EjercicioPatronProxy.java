public class EjercicioPatronProxy {
    public static void main(String[] args) {
        LibroReal libro = new LibroReal("texto 1", "Mauricio Matute", "El principito", 2055);
        ProxyLibro proxy = new ProxyLibro(libro);
        proxy.leer();
        proxy.setUsuario("Mau");
        proxy.leer();
    }
}
