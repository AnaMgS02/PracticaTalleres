package Taller2.vector;

import java.util.Scanner;

public class MainVector {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        FuncionesAvionV funcion = new FuncionesAvionV();
        int opcion = 0;
        do {
            String nombre;
            int clase;
            System.out.println(
                    "Menu\n1. Comprar Tiquete\n2. Mostrar Ocupacion del avion\n3. Mostrar valor a pagar por asiento\n4. Salir");
            int opcion1 = sc.nextInt();
            switch (opcion1) {
                case 1:
                    System.out.println("Ingrese su nombre por favor");
                    nombre = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Seleccione la clase\n1 para primera clase\n2 para clase turista");
                    clase = sc.nextInt();
                    funcion.comprarBoleto(nombre, clase);
                    break;
                case 2:
                    System.out.println("_______________________");
                    funcion.asientosVacios();
                    System.out.println("_______________________");
                    funcion.mostrarOcupacion(1);
                    System.out.println("_______________________");
                    funcion.mostrarOcupacion(2);
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
