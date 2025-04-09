public interface Bebida {
    void servir();
}
public class Cafe implements Bebida {
    public void servir() {
        System.out.println("Sirviendo café ☕");
    }
}
