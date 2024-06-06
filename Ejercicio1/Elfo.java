package Ejercicio1;

public class Elfo extends Criatura{
    public Elfo(String nombre, int edad) throws Exception {
        super(nombre, edad);
    }

    @Override
    public void realizarAccion() {
        System.out.println(getNombre() + " dispara una flecha mágica");
    }
}
