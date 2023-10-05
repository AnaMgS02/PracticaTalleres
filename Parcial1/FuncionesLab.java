package Parcial1;

import java.util.Scanner;

public class FuncionesLab {
    Scanner sc = new Scanner(System.in);
    int[][] matLaberinto = new int[5][5];
    String[] caminos = new String[2];

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

    public void mostrarLab() {
        for (int i = 0; i < matLaberinto.length; i++) {
            for (int j = 0; j < matLaberinto[0].length; j++) {
                System.out.print(" " + matLaberinto[i][j]);
            }
            System.out.println();
        }
    }

    /*
     * public void buscarCamino1() {
     * String camino = "";
     * int i = 0, j = 0, k = 0;
     * if (matLaberinto[0][0] == 1 && matLaberinto[4][4] == 1) {
     * if ((matLaberinto[1][0] == 1 || matLaberinto[0][1] == 1)
     * && (matLaberinto[3][4] == 1 || matLaberinto[4][3] == 1)) {
     * for (k = 0; k < caminos.length; k++) {
     * for (i = 0; i < matLaberinto.length; i++) {
     * for (j = 0; j < matLaberinto[0].length; j++) {
     * if (matLaberinto[i][j] == 1) {
     * matLaberinto[i][j] = 2; // Marcar la casilla como visitada
     * if (i < 4 && matLaberinto[i + 1][j] == 1) {
     * camino += "(" + i + "," + j + ") ";
     * break;
     * }
     * if (j < 4 && matLaberinto[i][j + 1] == 1) {
     * camino += "(" + i + "," + j + ") ";
     * continue;
     * }
     * if (i > 0 && matLaberinto[i - 1][j] == 1) {
     * camino += "(" + i + "," + j + ") ";
     * break;
     * }
     * if (j > 0 && matLaberinto[i][j - 1] == 1) {
     * camino += "(" + i + "," + j + ") ";
     * continue;
     * }
     * }
     * }
     * }
     * camino += "(" + i + "," + j + ") ";
     * caminos[k] = camino;
     * }
     * 
     * System.out.println("La matriz tiene salida");
     * System.out.println("Camino: " + caminos[k]);
     * } else {
     * }
     * } else {
     * System.out.println("Esta matriz no tiene salida");
     * }
     * 
     * }
     */

    public void buscarCamino() {
        int x = 0, y = 0, k = 0;
        String camino = "";
        while (x != 4 || y != 4) {
            camino += "(" + x + ", " + y + ")";
            matLaberinto[x][y] = 2; // Marcar la casilla como visitada
            // Mover hacia abajo si es posible
            if (x < 4 && matLaberinto[x + 1][y] == 1) {
                x++;
                continue;
            }
            // Mover hacia la derecha si es posible
            if (y < 4 && matLaberinto[x][y + 1] == 1) {
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
        camino += "(" + x + ", " + y + ")";
        caminos[k] = camino;
        k++;
        x = 0;
        y = 0;
        camino = "";
        while (x != 4 || y != 4) {
            camino += "(" + x + ", " + y + ")";
            matLaberinto[x][y] = 2; // Marcar la casilla como visitada
            // Mover hacia la derecha si es posible
            if (y < 4 && matLaberinto[x][y + 1] == 1) {
                y++;
                continue;
            }
            // Mover hacia abajo si es posible
            if (x < 4 && matLaberinto[x + 1][y] == 1) {
                x++;
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
        camino += "(" + x + ", " + y + ")";
        caminos[k] = camino;
        k++;
        for (k = 0; k < 2; k++) {
            System.out.println("Camino " + k + ": " + caminos[k]);
        }
    }
}
