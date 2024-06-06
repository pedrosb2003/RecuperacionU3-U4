package Ejercicio1;

public class Dragon extends Criatura implements Volar{

    public Dragon(String nombre, int edad) throws Exception {
        super(nombre, edad);
    }

    public void volar (){
        System.out.println(getNombre() + " vuela ágilmente sobre los árboles");
    }

    @Override
    public void realizarAccion() {
        System.out.println(getNombre() + " escupe fuego");
    }
}
