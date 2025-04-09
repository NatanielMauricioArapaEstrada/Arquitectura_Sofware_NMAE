import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VentaFacade ventaFacade = new VentaFacade();
        

        while (true) {
            System.out.println("\n===== MINI SUPERMERCADO =====");
            System.out.println("1. Iniciar nueva venta");
            System.out.println("2. Agregar producto");
            System.out.println("3. Finalizar venta");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ventaFacade.iniciarVenta();
                    break;
                case 2:
                    ventaFacade.agregarProducto();
                    break;
                case 3:
                    ventaFacade.finalizarVenta();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println(" Opción inválida, intente nuevamente.");
            }
        }
    }
}
