public class LibroReal implements ILibro {
    private String texto;
    private String autor;
    private String titulo;
    private int anio;

    public LibroReal(String texto, String autor, String titulo, int anio) {
        this.texto = texto;
        this.autor = autor;
        this.titulo = titulo;
        this.anio = anio;
    }

    @Override
    public void leer() {
        System.out.println("Informacion del libro:");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anio de publicacion: " + anio);
        System.out.println("Texto: " + texto);
    }
}
