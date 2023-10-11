package Parcial1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FuncionesLab {
    Scanner sc = new Scanner(System.in);
    int[][] matLaberinto = new int[5][5];
    String[] caminos = new String[2];

    public void leerMatrizArchivo(String laberinto) {

    try (BufferedReader br = new BufferedReader(new FileReader(laberinto))) {
        String linea;
        int i = 0;

        while ((linea = br.readLine()) != null && i < 5) {
            String[] elementos = linea.split(" "); // Suponiendo que los elementos estén separados por espacios

            for (int j = 0; j < 5; j++) {
                matLaberinto[i][j] = Integer.parseInt(elementos[j]);
            }

            i++;
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

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

    public void marcarCamino() {
        for (int i = 0; i < matLaberinto.length; i++) {
            for (int j = 0; j < matLaberinto[0].length; j++) {
                if (matLaberinto[i][j] == 1) {
                    if (i < 4 && matLaberinto[i + 1][j] == 1) {
                        matLaberinto[i][j] = 2;
                    }
                    if (j < 4 && matLaberinto[i][j + 1] == 1) {
                        matLaberinto[i][j] = 2;
                    }
                    if (i > 0 && matLaberinto[i - 1][j] == 1) {
                        matLaberinto[i][j] = 2;
                    }
                    if (j > 0 && matLaberinto[i][j - 1] == 1) {
                        matLaberinto[i][j] = 2;
                    }
                }
            }
        }
        matLaberinto[4][4] = 2;
    }

    public void buscarCamino() {
        int i = 0, j = 0;
        String camino = "";
        if (matLaberinto[i][j] == 2 && matLaberinto[4][4] == 2) {
            while (i != 4 || j != 4) {
                camino += "(" + i + ", " + j + ") ";
                matLaberinto[i][j] = 3; // Marcar la casilla actual

                if (i < 4 && matLaberinto[i + 1][j] == 2) {
                    i++;
                    continue;
                }
                if (j < 4 && matLaberinto[i][j + 1] == 2) {
                    j++;
                    continue;
                }
                if (i > 0 && matLaberinto[i - 1][j] == 2) {
                    i--;
                    continue;
                }
                if (j > 0 && matLaberinto[i][j - 1] == 2) {
                    j--;
                    continue;
                }
            }
            camino += "(4, 4)";
            System.out.println("Camino 1: " + camino);
        } else {
            System.out.println("No hay camino.");
        }
    }

    public void buscarCamino2() {
        int i = 0, j = 0;
        String camino = "";
        if (matLaberinto[i][j] > 1 && matLaberinto[4][4] >1) {
            while (i != 4 || j != 4) {
                camino += "(" + i + ", " + j + ")";
                matLaberinto[i][j] = 4; // Marcar la casilla actual
                if (j < 4 && matLaberinto[i][j + 1] >1) {
                    j++;
                    continue;
                }
                if (i < 4 && matLaberinto[i + 1][j] >1) {
                    i++;
                    continue;
                }
                if (j > 0 && matLaberinto[i][j - 1] >1) {
                    j--;
                    continue;
                }
                if (i > 0 && matLaberinto[i - 1][j] >1) {
                    i--;
                    continue;
                }
            }
            camino += "(4, 4)";
            System.out.println("Camino 2: " + camino);
        } else {
            System.out.println("No hay camino.");
        }

    }
}
