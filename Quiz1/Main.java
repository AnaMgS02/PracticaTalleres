package Quiz1;

import java.util.Scanner;

public class Main {
    static FuncionesCine fc = new FuncionesCine();
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Equipo: \nAna Maria Gomez Soto\nJose Manuel Correa Gomez");
        boolean salir = true;
        int opcion = 0;
        while (salir == true) {
            String nombre, asiento;
            int sala = 0;
            System.out.println("¿Que quieres hacer?");
            System.out.println("1. Reservar asiento \n2. Mostrar ocupacion \n3. Consultar reserva");
            System.out.print("Opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    leer.nextLine();
                    System.out.println("Digite su nombre");
                    nombre = leer.nextLine();
                    System.out.println("Seleccione \n1: Sala 1\n2: Sala 2");
                    sala = leer.nextInt();
                    if (sala == 1) {
                        fc.reservarS1(nombre);
                    } else if (sala == 2) {
                        fc.reservarS2(nombre);
                    } else {
                        System.out.println("La sala indicada no existe");
                    }
                    break;
                case 2:
                    System.out.print("\033[H]\033[2J");
                    System.out.flush();
                    System.out.println("Seleccione \n1: Sala 1\n2: Sala 2");
                    sala = leer.nextInt();
                    fc.mostrarSala(sala);
                    break;
                case 3:
                    System.out.print("\033[H]\033[2J");
                    System.out.flush();
                    leer.nextLine();
                    System.out.println("Digite sala de reservada\n1: Sala 1\n2: Sala 2");
                    sala = leer.nextInt();
                    fc.mostrarReserva(sala);
                    break;
                case 4:
                    salir = false;
                    break;
                default:
                    break;
            }
        }
    }
}