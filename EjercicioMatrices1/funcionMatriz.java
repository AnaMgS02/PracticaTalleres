package EjercicioMatrices1;

import java.util.Scanner;

import Taller2.vector.mainVector;

public class funcionMatriz {
    Scanner sc=new Scanner
    int[][] matriz1 = { { 3, 6, 9, 4 }, { 2, 5, 7, 1 } };
    int[][] matriz2 = { { 3, 1, 9, 6 }, { 6, 2, 8, 7 } };
    int[][] matriz=new int[4][4];
    int[][] matrizR = new int[2][4];

    public void sumaMatrices(int[][] matriz1, int[][]matriz2) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + (matriz1[i][j] + matriz2[i][j]));
            }
            System.out.println();
        }
    }
    public void mostrarMatriz() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println();
        }
    }
    public void addNumero(int num){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=num;
            }
            System.out.println();
        }
    }
    public int sumarFila(int fila){
        int suma=0;
        for (int i = 0; i < 4; i++) {
            suma+=matriz[fila][i];
        }
        return suma;
    }
    public int sumarColumna(int columna){
        int suma=0;
        for (int i = 0; i < 4; i++) {
            suma+=matriz[i][columna];
        }
        return suma;
    }
    
    public int sumarDiagonalP(){
        int suma=0;
        for (int i = 0; i < 4; i++) {
            for(int j=0;j<4;j++){
                if(i==j){
                    suma+=matriz[i][j];
                }
            }
        }
        return suma;
    }
    public int sumarDiagonalS(){
        int suma=0;
        for (int i = 1; i < 4; i++) {
            suma+=matriz[i][matriz.length-i];
        }
        return suma;
    }
    public 
}
