package Ejercicio1;

public class Mago extends Criatura{
    int nivelMagico;

    public Mago(String nombre, int edad) throws Exception{
        super(nombre, edad);
    }

    public Mago(String nombre, int edad, int nivelMagico) throws Exception {
        super(nombre, edad);
        this.nivelMagico = nivelMagico;
    }

    public int getNivelMagico() {
        return nivelMagico;
    }

    public void setNivelMagico(int nivelMagico) {
        this.nivelMagico = nivelMagico;
    }

    @Override
    public void realizarAccion() {
        if (nivelMagico >= 50){
            System.out.println(getNombre() + " lanza un poderoso hechizo");
        } else if (nivelMagico < 50) {
            System.out.println(getNombre() + " genera una pequeña chispa");
        }
    }
}
