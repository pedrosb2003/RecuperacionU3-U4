package Ejercicio1;

public class P1Principal {
    public static void main(String[] args) throws Exception {
        Elfo e1 = new Elfo("Elfo 1", 20);
        Dragon d1 = new Dragon("Dragon 1", 25);
        HombreLobo hl1 = new HombreLobo("Hombre Lobo 1", 30);
        Mago m1 = new Mago("Mago 1", 5, 20);
        Mago m2 = new Mago("Mago 2", 37, 60);

        //Elfo e2 = new Elfo("Elfo 2", -3);
        Elfo e3 = new Elfo(null, 20);
        e1.realizarAccion();
        d1.realizarAccion();
        hl1.realizarAccion();

        d1.volar();

        m1.realizarAccion();
        m2.realizarAccion();
    }
}
