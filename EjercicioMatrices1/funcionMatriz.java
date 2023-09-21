package EjercicioMatrices1;

import java.util.Scanner;

import Taller2.vector.MainVector;

public class FuncionMatriz {
    // matriz.lenght # de filas, matriz.lenght[0] # de columnas
    Scanner sc = new Scanner(System.in);
    int[][] matriz1 = { { 3, 6, 9, 4 }, { 2, 5, 7, 1 } };
    int[][] matriz2 = { { 3, 1, 9, 6 }, { 6, 2, 8, 7 } };
    int[][] matriz = new int[4][4];
    int[][] matrizR = new int[2][4];

    public void sumaMatrices() {
        System.out.println("Matriz 1");
        mostrar(matriz1);
        System.out.println("Matriz 2");
        mostrar(matriz2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                matrizR[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("Resultado Matriz 1 + Matriz 2");
        mostrar(matrizR);
    }

    public void addNumero() {
        int numero = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingresa nuevo elemento: ");
                numero = sc.nextInt();
                matriz[i][j] = numero;
            }
            System.out.println();
        }
    }

    public int sumarFila(int fila) {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += matriz[fila - 1][i];
        }
        return suma;
    }

    public int sumarColumna(int columna) {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += matriz[i][columna - 1];
        }
        return suma;
    }

    public int sumarDiagonalP() {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }

    public int sumarDiagonalS() {
        int suma = 0;
        int j = 3;
        for (int i = 0; i < 4; i++) {
            suma = suma + matriz[i][j];
            j--;
        }
        return suma;
    }

    public double promedioMatriz() {
        int suma = 0, cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
                cont++;
            }
        }
        return suma / cont;
    }

    public void mostrarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // PRODUCTO DE MATRICES
    public int[][] A = { { 1, 2 }, { 3, 4 } };
    public int[][] B = { { 3, -2 }, { 1, 5 } };
    public int[][] C = { { 4, -1 }, { -2, 3 } };
    public int[][] D = { { -2, 5 }, { 6, -3 } };
    public int[][] E = { { 1, 2, 0 }, { 3, 2, -1 }, { 5, 1, -2 } };
    public int[][] F = { { 3, 4, 0 }, { 1, 0, -2 }, { -1, 2, 1 } };

    public int[][] producto(int matriz1[][], int matriz2[][]) {
        int[][] matriz = new int[matriz1.length][matriz2[0].length];
        for (int i = 0; i < matriz1.length; i++) {// Debo recorrer 2 veces la misma fila o columna
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    matriz[i][j] += ((matriz1[i][k]) * (matriz2[k][j]));

                }
            }
        }
        return matriz;
    }

    public void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    int[][] G = { { 2, 4 }, { -3, 5 } };
    int[][] H = { { -1, -2 }, { 3, -3 } };

    public int[][] restaMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] matriz = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return matriz;
    }

    public void eleccion() {
        System.out.println("Elije la operacion a realizar (Escribe el numero que corresponda)");
        System.out.println("1: AB\n2: BA\n3: CD\n4: DC\n5: EF\n6: FE\n7: GH-HG");
        int eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Matriz A");
                mostrar(A);
                System.out.println("Matriz B");
                mostrar(B);
                System.out.println("Resultado A*B");
                mostrar(producto(A, B));
                break;
            case 2:
                System.out.println("Matriz B");
                mostrar(B);
                System.out.println("Matriz A");
                mostrar(A);
                System.out.println("Resultado B*A");
                mostrar(producto(B, A));
                break;
            case 3:
                System.out.println("Matriz C");
                mostrar(C);
                System.out.println("Matriz D");
                mostrar(D);
                System.out.println("Resultado C*D");
                mostrar(producto(C, D));
                break;
            case 4:
                System.out.println("Matriz D");
                mostrar(D);
                System.out.println("Matriz C");
                mostrar(C);
                System.out.println("Resultado D*C");
                mostrar(producto(D, C));
                break;
            case 5:
                System.out.println("Matriz E");
                mostrar(E);
                System.out.println("Matriz F");
                mostrar(F);
                System.out.println("Resultado E*F");
                mostrar(producto(E, F));
                break;
            case 6:
                System.out.println("Matriz F");
                mostrar(F);
                System.out.println("Matriz E");
                mostrar(E);
                System.out.println("Resultado F*E");
                mostrar(producto(F, E));
                break;
            case 7:
                System.out.println("Matriz G");
                mostrar(G);
                System.out.println("Matriz H");
                mostrar(H);
                System.out.println("Resultado GH-HG");
                mostrar((restaMatrices((producto(G, H)), (producto(H, G)))));
                break;
            default:
                break;
        }

    }
}
