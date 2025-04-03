public class ProxyLibro implements ILibro {
    private LibroReal libro;
    private String usuario;

    public ProxyLibro(LibroReal libro) {
        this.libro = libro;
        this.usuario = "Desconocido";
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void leer() {
        if ("Mau".equals(usuario)) {
            libro.leer();
        } else {
            System.out.println("---------------------------------------");
            System.out.println("Acceso denegado. Usuario no autorizado.");
            System.out.println("---------------------------------------");
        }
    }
}
