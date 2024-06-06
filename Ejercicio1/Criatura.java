package Ejercicio1;

public abstract class Criatura {
    private String nombre;
    private int edad;
    private int energia;

    public Criatura(String nombre, int edad) throws Exception {
        if (edad < 0){
            throw new RuntimeException("La edad introducida para no es correcta");
        }else if (nombre == null){
            throw new RuntimeException("El nombre no puede estar vacio");
        } else {
            this.nombre = nombre;
            this.edad = edad;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public abstract void realizarAccion();

    @Override
    public String toString() {
        return "Ejercicio1.Criatura{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", energia=" + energia +
                '}';
    }
}
