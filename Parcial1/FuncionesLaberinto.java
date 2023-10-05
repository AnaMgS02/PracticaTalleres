package Parcial1;

import java.util.Scanner;

public class FuncionesLaberinto {
    Scanner sc = new Scanner(System.in);
    int[][] matLaberinto = new int[5][5];

    public void ingresarLabTec() {
        System.out.println("Ingresa los datos del laberinto fila por fila (0 ó 1)");
        for (int i = 0; i < matLaberinto.length; i++) {
            for (int j = 0; j < matLaberinto[0].length; j++) {
                System.out.print("Dato: ");
                int dato = sc.nextInt();
                if (dato != 0 && dato != 1) {
                    System.out.println("Recuerda que sólo puedes ingresar 0 ó 1, intenta nuevamente");
                    System.out.print("Dato: ");
                    dato = sc.nextInt();
                }
                matLaberinto[i][j] = dato;
            }
            System.out.println();
        }
    }
    public void buscarCamino1() {
        int n = matLaberinto.length;
        String camino = "";
    
        if (matLaberinto[0][0] == 1 && matLaberinto[4][4] == 1) {
            int x = 0;
            int y = 0;
    
            while (x != n - 1 || y != n - 1) {
                camino += "(" + x + "," + y + ") ";
                matLaberinto[x][y] = 2; // Marcar la casilla como visitada
    
                // Mover hacia abajo si es posible
                if (x < n - 1 && matLaberinto[x + 1][y] == 1) {
                    x++;
                    continue;
                }
    
                // Mover hacia la derecha si es posible
                if (y < n - 1 && matLaberinto[x][y + 1] == 1) {
                    y++;
                    continue;
                }
    
                // Si no es posible avanzar, retroceder
                if (x > 0 && matLaberinto[x - 1][y] == 1) {
                    x--;
                    continue;
                }
    
                if (y > 0 && matLaberinto[x][y - 1] == 1) {
                    y--;
                    continue;
                }
            }
    
            camino += "(" + (n - 1) + "," + (n - 1) + ")";
            System.out.println("La matriz tiene salida");
            System.out.println("Camino 1: " + camino);
        } else {
            System.out.println("Esta matriz no tiene salida");
        }
    }
    
}