package Quiz2;

import java.util.Scanner;

public class FuncionesTriqui {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public String[][] tablero = { { "_", "_", "_" }, { "_", "_", "_" }, { "_", "_", "_" } };
    Scanner sc = new Scanner(System.in);

    public void mostrarTablero() {
        for (int i = 0; i < 1; i++) {
            System.out.print("Fil/Col ");
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(" Col " + j);
            }
            System.out.println();
        }
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("Fila " + i);
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j].equals("_")) {
                    System.out.print("|" + ANSI_RED + " " + ANSI_RESET + "|");
                } else if (tablero[i][j].equals("O")) {
                    System.out.print("|" + ANSI_BLUE + tablero[i][j] + ANSI_RESET + "|");
                } else {
                    System.out.print("|" + ANSI_PURPLE + tablero[i][j] + ANSI_RESET + "|");
                }
            }
            System.out.println();
        }
    }

    public boolean vacio(int i, int j) {
        return (tablero[i][j].equals("_"));
    }

    public boolean triqui(String simbolo) {
        boolean win = false;
        if (tablero[0][0].equals(simbolo) && tablero[1][1].equals(simbolo) && tablero[2][2].equals(simbolo)) {
            win = true;
        } else if (tablero[0][0].equals(simbolo) && tablero[0][1].equals(simbolo) && tablero[0][2].equals(simbolo)) {
            win = true;
        } else if (tablero[0][0].equals(simbolo) && tablero[1][0].equals(simbolo) && tablero[2][0].equals(simbolo)) {
            win = true;
        } else if (tablero[0][2].equals(simbolo) && tablero[1][2].equals(simbolo) && tablero[2][2].equals(simbolo)) {
            win = true;
        } else if (tablero[0][2].equals(simbolo) && tablero[1][1].equals(simbolo) && tablero[2][2].equals(simbolo)) {
            win = true;
        } else if (tablero[1][0].equals(simbolo) && tablero[1][1].equals(simbolo) && tablero[1][2].equals(simbolo)) {
            win = true;
        } else if (tablero[2][0].equals(simbolo) && tablero[2][1].equals(simbolo) && tablero[2][2].equals(simbolo)) {
            win = true;
        } else if (tablero[0][1].equals(simbolo) && tablero[1][1].equals(simbolo) && tablero[2][1].equals(simbolo)) {
            win = true;
        } else {
            win = false;
        }
        if (win) {
            System.out.println("Ha ganado " + simbolo);
            mostrarTablero();
        }
        return win;
    }

    public void jugar() {
        int player1 = 0, player2 = 0;// Contador de veces que ha jugado
        String ganador = "Ninguno";
        int fila = 0, columna = 0;
        while (player2 < 5) {
            mostrarTablero();
            System.out.println("Jugador 1 digite el número de fila y columna donde quiere poner su ficha");
            System.out.print("Fila: ");
            fila = sc.nextInt();
            System.out.print("Columna: ");
            columna = sc.nextInt();
            if (vacio(fila, columna)) {
                tablero[fila][columna] = "O";

            } else {
                System.out.println("La ubicacion indicada esta ocupada, intente otra vez");
                System.out.print("Fila: ");
                fila = sc.nextInt();
                System.out.print("Columna: ");
                columna = sc.nextInt();
                if (vacio(fila, columna)) {
                    tablero[fila][columna] = "O";

                } else {
                    System.out.println("La ubicacion indicada esta ocupada, pasa al siguiente jugador");
                }
            }
            player1++;
            if (triqui("O")) {
                ganador = "Player 1";
                break;
            }
            mostrarTablero();
            System.out.println("Jugador 2 dijite  digite el número de fila y columna donde quiere poner su ficha");
            System.out.print("Fila: ");
            fila = sc.nextInt();
            System.out.print("Columna: ");
            columna = sc.nextInt();
            if (vacio(fila, columna)) {
                tablero[fila][columna] = "X";

            } else {
                System.out.println("La ubicacion indicada esta ocupada, intente otra vez");
                System.out.print("Fila: ");
                fila = sc.nextInt();
                System.out.print("Columna: ");
                columna = sc.nextInt();
                if (vacio(fila, columna)) {
                    tablero[fila][columna] = "X";

                } else {
                    System.out.println("La ubicacion indicada esta ocupada, pasa al siguiente jugador");
                }
            }
            player2++;
            if (triqui("X")) {
                ganador = "Player 2";
                break;
            }

        }
        if (ganador.equals("Ninguno")) {
            System.out.println("Ha sido un empate");
        } else {
            System.out.println("El ganador ha sido el " + ganador);
        }
    }
}
