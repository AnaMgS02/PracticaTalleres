package Taller2.lista;

import java.util.Scanner;

public class FuncionesAvionL {
    Scanner sc = new Scanner(System.in);
    public Nodo head = null;

    public void addNuevo(String nombre, String clase, double precio) {
        int i = 0;
        Nodo nuevo;
        if (head == null) {
            nuevo = new Nodo(nombre, clase, i, precio);
            head = nuevo;
        } else {
            Nodo pointer = head;
            i=pointer.numA+1;
            while (pointer.next != null) {
                pointer = pointer.next;
                i++;
            }
            nuevo = new Nodo(nombre, clase, i, precio);
            pointer.next = nuevo;
        }
    }

    public boolean asientosVacios() {
        boolean estado = false;
        int contF = 0, contT = 0;
        if (head == null) {
            estado = true;
            System.out.println(
                    "El avión está vacío, asisentos\n|Primera clase: " + (5 - contF) + "\n|Turista: " + (8 - contT));
        } else {
            Nodo pointer = head;
            while (pointer != null) {
                if (pointer.clase.equals("T")) {
                    contT++;
                } else if (pointer.clase.equals("F")) {
                    contF++;
                }
                pointer = pointer.next;
            }
            System.out.println("|Asisentos disponibles\n|Primera clase: " + (5 - contF) + "\n|Turista: " + (8 - contT));
        }
        if (contF < 5 || contT < 8) {
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }

    public double precio(int clase) {
        double precioT = 0;
        int precioBase = 85000;
        double combustible = precioBase * 0.15;
        double administracion = precioBase * 0.07;
        double seguro = precioBase * 0.10;
        double vClase = 0;
        if (clase==1) {
            vClase = (precioBase + combustible + administracion + seguro) * 0.65;
            precioT = (precioBase + combustible + administracion + seguro + vClase);
        } else if (clase==2) {
            precioT = (precioBase + combustible + administracion + seguro);
        } else {
            System.out.println("Clase invalida");
        }
        /*
         * System.out.println("Detalles de cobro");
         * System.out.println("Precio de vuelo base: "+precioBase);
         * System.out.println("Combustible 15%: " + combustible);
         * System.out.println("Administración 7%: " + administracion);
         * System.out.println("Seguro 10%: " + seguro);
         * System.out.println("Asiento en clase: " +clase+": "+ vClase);
         * System.out.println("Valor Total: " + precioT);
         */
        return precioT;
    }

    public void comprarBoleto(int clase, String nombre) {
        double precioT= 0;
        String classe="";
        if (asientosVacios()) {
            precioT=precio(clase);
            if(clase==1){
                classe="F";
            }else{
                classe="T";
            }
            addNuevo(nombre, classe, precioT);
            VerTiquete(nombre);
        } else {
            System.out.println("------------------");
            System.out.println("El avión está lleno");
            System.out.println("------------------");
        }
    }

    public void VerTiquete(String nombre) {
        if (head == null) {
            System.out.println("No se han comprado tiquetes para este vuelo");
        } else {
            Nodo pointer = head;
            while (pointer != null) {
                if (pointer.nombPasajero.equals(nombre)) {
                    System.out.println("\n###############################");
                    System.out.println("|Informacion de tiquete");
                    System.out.println("|Nombre: " + pointer.nombPasajero);
                    System.out.println("|Asiento: " + pointer.clase+pointer.numA);
                    System.out.println("|Precio: " + pointer.precio);
                    System.out.println("###############################");
                    break;
                } else {
                    pointer = pointer.next;
                    continue;
                }
            }
        }
    }

    public void mostrarOcupacion() {
        Nodo pointer = head;
        while (pointer != null) {
            System.out.println(pointer.clase+pointer.numA+ ": Ocupado por: " + pointer.nombPasajero);
            pointer = pointer.next;
        }
        asientosVacios();
    }
}