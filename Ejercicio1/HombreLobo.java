package Ejercicio1;

public class HombreLobo extends Criatura{
    public HombreLobo(String nombre, int edad) throws Exception {
        super(nombre, edad);
    }

    @Override
    public void realizarAccion() {
        System.out.println(getNombre() + " aulla a la luna");
    }
}
