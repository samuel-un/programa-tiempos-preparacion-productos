package controller;

import model.Producto;
import model.Proceso;

public class ProductoController {
    private Producto producto;

    public ProductoController(Producto producto) {
        this.producto = producto;
    }

    public void agregarProceso(String nombre, int duracion) {
        producto.agregarProceso(new Proceso(nombre, duracion));
    }

    public int calcularTiempoTotal() {
        return producto.calcularTiempoTotal();
    }
}
