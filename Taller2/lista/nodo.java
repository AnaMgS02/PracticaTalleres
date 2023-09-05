package Taller2.lista;

public class nodo {
    public String nombPasajero;
    public String clase;//TURISTA(T) || PRIMERA(F)
    public int numA;
    public double precio;
    public nodo next = null;
    public nodo(String nombPasajero, String clase, int numA, double precio) {
        this.nombPasajero = nombPasajero;
        this.clase=clase;
        this.numA=numA;
        this.precio = precio;
    }


}
