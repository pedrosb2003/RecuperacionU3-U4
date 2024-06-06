package Ejercicio2;

public abstract class Invitado {
    private String nombre;
    private int fama;

    public Invitado() {
    }

    public Invitado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFama() {
        return fama;
    }

    public void setFama(int fama) {
        this.fama = fama;
    }

    @Override
    public String toString() {
        return nombre + " " + fama;
    }
}
