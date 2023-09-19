package Taller3_Matrices;

import java.util.Scanner;

import Taller2.lista.nodo;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        funcionesBus fc = new funcionesBus();
        int volver = 1, opcion1 = 0;
        while (volver == 1) {
            System.out.println("Escriba el numero que corresponde: ");
            System.out
                    .println("1: Comprar tiquete\n2: Mostrar ocupación B1\n3: Mostrar ocupación B2\n4: Buscar reserva");
            opcion1 = sc.nextInt();
            switch (opcion1) {
                case 1:
                    fc.comprarBoleto();
                    break;
                case 2:
                    fc.mostrarBus(1, 0);
                    break;
                case 3:
                    System.out.println("Bus B - Primer Piso");
                    fc.mostrarBus(2, 1);
                    System.out.println("Bus B - Segundo Piso");
                    fc.mostrarBus(2, 2);
                    break;
                case 4:
                    fc.buscarReserva();
                    break;
                default:
                    break;
            }
            System.out.println("Si desea volver al menu presione 1");
            volver = sc.nextInt();
        }
        fc.comprarBoleto();
    }
}