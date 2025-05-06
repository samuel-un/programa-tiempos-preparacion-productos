import model.Producto;
import controller.ProductoController;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Producto de ejemplo");
        ProductoController controller = new ProductoController(producto);

        controller.agregarProceso("Corte", 10);
        controller.agregarProceso("Ensamblaje", 20);

        System.out.println("Tiempo total: " + controller.calcularTiempoTotal() + " minutos");
    }
}
