package EjercicioMatrices1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        funcionMatriz fc = new funcionMatriz();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio que desea ver: ");
        System.out.println("A\nB\nC\n Escriba la letra en mayuscula");
        char ejercicio = sc.next().charAt(0);
        switch (ejercicio) {
            case 'A':
                fc.sumaMatrices();
                fc.mostrarMatrizR();
                break;
            case 'B':
                int volverB = 1;
                while (volverB == 1) {
                    System.out.println("Que operación desea hacer");
                    System.out.println("1. Llenar TODA la matriz 4x4 con numeros ");
                    System.out.println("2. Suma una fila completa");
                    System.out.println("3. Suma una columna");
                    System.out.println("4. Sumar la diagonal principal");
                    System.out.println("5. Sumar la diagonal inversa");
                    System.out.println("6. Imprimir el promedio de todos los valores de la matriz");
                    char hacer = sc.next().charAt(0);
                    int numero = 0;
                    switch (hacer) {
                        case '1':
                            fc.addNumero();
                            fc.mostrarMatriz();
                            break;
                        case '2':
                            fc.mostrarMatriz();
                            System.out.println("Ingrese el número de fila que desea sumar");
                            numero = sc.nextInt();
                            System.out.println(fc.sumarFila(numero));
                            break;
                        case '3':
                            fc.mostrarMatriz();
                            System.out.println("Ingrese el número de columna que desea sumar");
                            numero = sc.nextInt();
                            System.out.println(fc.sumarColumna(numero));
                            break;
                        case '4':
                            fc.mostrarMatriz();
                            System.out.print("Diagonal Principal: ");
                            System.out.println(fc.sumarDiagonalP());
                            break;
                        case '5':
                            fc.mostrarMatriz();
                            System.out.print("Diagonal Secundaria: ");
                            System.out.println(fc.sumarDiagonalS());
                            break;
                        case '6':
                            fc.mostrarMatriz();
                            System.out.print("Promedio de valor de elementos: ");
                            System.out.println(fc.promedioMatriz());
                            break;
                        default:
                            break;
                    }
                    System.out.println("Desea volver al menu?");
                    volverB=sc.nextInt();
                }
                case 'C':
                fc.eleccion();
                break;
            default:
                break;
        }
    }
}
