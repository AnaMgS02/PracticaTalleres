package Taller2.lista;

import java.util.Scanner;

public class mainLista {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        funcionesAvionL funcion = new funcionesAvionL();
        int opcion = 0;
        do {
            String nombre;
            int clase;
            System.out.println(
                    "Menu\n1. Comprar Tiquete\n2. Mostrar Ocupacion del avion\n3. Mostrar valor a pagar por asiento\n4. Salir");
            int opcion1 = sc.nextInt();
            switch (opcion1) {
                case 1:
                    System.out.println("Escriba la clase para su vuelo\n1: para primera clase\n2: para clase turista");
                    clase = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Escriba por favor su nombre: ");
                    nombre = sc.nextLine();
                    funcion.comprarBoleto(clase, nombre);
                    break;
                case 2:
                    System.out.println("_______________________");
                    funcion.mostrarOcupacion();
                    break;
                case 3:
                    System.out.println("Tarifas");
                    System.out.println("Precio en primera clase: $" + funcion.precio(1));
                    System.out.println("Precio en clase turista: $" + funcion.precio(2));
                    break;
                default:
                    break;
            }
            System.out.println("Volver al inicio, pulse 1 para si");
            opcion = sc.nextInt();
        } while (opcion == 1);
    }

}
