package Taller2.lista;

public class nodo {
    public String nombPasajero;
    public String clase;//TURISTA(T) || PRIMERA(F)
    public int numA;
    public String asiento=clase+numA;//T de [5,12] ^ F de [0,4] {F0,F1,...,T5,T6}
    public int precio;
    public nodo next = null;
    public nodo(String nombPasajero, String idPasajero, String clase, String asiento, int precio) {
        this.nombPasajero = nombPasajero;
        this.clase=clase;
        this.numA=numA;
        this.precio = precio;
    }


}
