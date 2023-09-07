package EjercicioMatrices1;

import java.util.Scanner;

import Taller2.vector.mainVector;

public class funcionMatriz {
    // matriz.lenght # de filas, matriz.lenght[0] # de columnas
    Scanner sc = new Scanner(System.in);
    int[][] matriz1 = { { 3, 6, 9, 4 }, { 2, 5, 7, 1 } };
    int[][] matriz2 = { { 3, 1, 9, 6 }, { 6, 2, 8, 7 } };
    int[][] matriz = new int[4][4];
    int[][] matrizR = new int[2][4];

    public void sumaMatrices() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                matrizR[i][j] = matriz1[i][j] + matriz2[i][j];
            }
            System.out.println();
        }
    }

    public void mostrarMatrizR() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + matrizR[i][j]);
            }
            System.out.println();
        }
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
        int j=3;
        for (int i = 0; i < 4; i++) {
            suma =suma +matriz[i][j];
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
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    int[][] matrizA = { { 1, 2 }, { 3, 4 } };
    int[][] matrizB = { { 3, -2 }, { 1, 5 } };
    int[][] matrizC = { { 4, -1 }, { -2, 3 } };
    int[][] matrizD = { { -2, 5 }, { 6, -3 } };
    int[][] matrizE = { { 1, 2, 0 }, { 3, 2, -1 }, { 5, 1, -2 } };
    int[][] matrizF = { { 3, 4, 0 }, { 1, 0, -2 }, { -1, 2, 1 } };
    public void producto(){

        
    }
    int[][] matrizG = { { 2, 4 }, { -3, 5 } };
    int[][] matrizH = { { -1, -2 }, { 3, -3 } };
}
