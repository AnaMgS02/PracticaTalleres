import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        funcionesCajero funcion = new funcionesCajero();
        boolean eleccion = false;
        int movimiento = 0;
        do {
            System.out.println("Ingrese por favor su número de cuenta");
            int numCuenta = sc.nextInt();
            if (funcion.sesion(numCuenta)) {
                System.out.println("Selecione\n1:Consultar saldo\n2:Retirar\n3:Consignar\n4:Ver ultimo movimiento");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        funcion.consultaSaldo(numCuenta);
                        break;
                    case 2:
                        System.out.println("Ingrese la suma a retirar");
                        int valorRet = sc.nextInt();
                        funcion.retiro(numCuenta, valorRet);
                        movimiento = valorRet + 500;
                        funcion.movs(movimiento);
                        break;
                    case 3:
                        System.out.println("Ingrese el valor a consignar");
                        int valorCons = sc.nextInt();
                        funcion.consignacion(numCuenta, valorCons);
                        funcion.movs(valorCons);
                        break;
                    case 4:
                        funcion.imprimirTransacion();
                        break;
                    default:
                        System.out.println("No se reconoce la opcion elegida");
                        break;
                }
                System.out.println("¿Volver a ingresar? 1 para Sí, 0 para No");
                eleccion = sc.nextBoolean();
            }
        } while (eleccion);

    }
}
