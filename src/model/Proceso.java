package model;

public class Proceso {
    private String nombre;
    private int duracionMinutos;

    public Proceso(String nombre, int duracionMinutos) {
        this.nombre = nombre;
        this.duracionMinutos = duracionMinutos;
    }

    public String getNombre() { return nombre; }
    public int getDuracionMinutos() { return duracionMinutos; }
}
