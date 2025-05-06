package model;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String nombre;
    private List<Proceso> procesos = new ArrayList<>();

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProceso(Proceso proceso) {
        procesos.add(proceso);
    }

    public int calcularTiempoTotal() {
        int total = 0;
        for (Proceso p : procesos) {
            total += p.getDuracionMinutos();
        }
        return total;
    }

    public List<Proceso> getProcesos() { return procesos; }
    public String getNombre() { return nombre; }
}
