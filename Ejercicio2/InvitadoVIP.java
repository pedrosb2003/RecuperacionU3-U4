package Ejercicio2;

public class InvitadoVIP extends Invitado{
    private int aporte = 10;

    public InvitadoVIP(int aporte) {
        this.aporte = aporte;
    }

    public InvitadoVIP(String nombre, int aporte) {
        super(nombre);
        this.aporte = aporte;
    }

    public int getAporte() {
        return aporte;
    }

    public void setAporte(int aporte) {
        this.aporte = aporte;
    }

    public int aporte(){

        return 0; //setFama() + aporte;
    }
}
