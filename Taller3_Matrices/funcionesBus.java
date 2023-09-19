package Taller3_Matrices;

import java.util.Scanner;

/*busA: Buses de un piso 36 asientos [4][9]
busB: Buses de dos pisos
    //busBP1: Piso 1 14 asientos [2][7]
    //busBP2: Piso 2 20 asientos [4][5]*/
public class funcionesBus {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    Scanner sc = new Scanner(System.in);
    String[][] busA = new String[4][9];
    String[][] busBP1 = new String[2][7];
    String[][] busBP2 = new String[4][5];
    String[][] pasajerosA = new String[4][9];
    String[][] pasajerosBP1 = new String[2][7];
    String[][] pasajerosBP2 = new String[4][5];

    public void mostrarBus(int bus, int piso) {
        String[][] buss = busA;
        if (bus == 1) {
            buss = busA;
        } else if (bus == 2 && piso == 1) {
            buss = busBP1;
        } else {
            buss = busBP2;
        }
        for (int i = 0; i < 1; i++) {
            System.out.print("Fil/Col ");
            for (int j = 0; j < buss[0].length; j++) {
                System.out.print(" Col " + j);
            }
            System.out.println();
        }
        for (int i = 0; i < buss.length; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < buss[0].length; j++) {
                if (buss[i][j] == null) {
                    System.out.print(ANSI_RED + " vacio" + ANSI_RESET);
                } else {
                    System.out.print(" " + buss[i][j]);
                }
            }
            System.out.println();
        }
    }

    public boolean asientosVacios(int bus, int piso) {
        int contVacio = 0;
        if (bus == 1) {
            for (int i = 0; i < busA.length; i++) {
                for (int j = 0; j < busA[0].length; j++) {
                    if (busA[i][j] == null) {
                        contVacio++;
                    }
                }
            }
        } else if (bus == 2 && piso == 1) {
            for (int i = 0; i < busBP1.length; i++) {
                for (int j = 0; j < busBP1[0].length; j++) {
                    if (busBP1[i][j] == null) {
                        contVacio++;
                    }
                }
            }
        } else if (bus == 2 && piso == 2) {
            for (int i = 0; i < busBP2.length; i++) {
                for (int j = 0; j < busBP2[0].length; j++) {
                    if (busBP2[i][j] == null) {
                        contVacio++;
                    }
                }
            }
        }
        return (contVacio > 0);
    }

    public void asientoRandom(int bus, int piso, String nombre) {
        boolean listo = false;
        if (bus == 1) {
            for (int i = 0; i < busA.length; i++) {
                for (int j = 0; j < busA[0].length; j++) {
                    if (busA[i][j] == null) {
                        pasajerosA[i][j] = nombre;
                        busA[i][j] = "A " + i + "-" + j;
                        listo = true;
                        break;
                    }
                }
                if (listo) {
                    break;
                }
            }
        } else if (bus == 2 && piso == 1) {
            for (int i = 0; i < busBP1.length; i++) {
                for (int j = 0; j < busBP1[0].length; j++) {
                    if (busBP1[i][j] == null) {
                        pasajerosBP1[i][j] = nombre;
                        busBP1[i][j] = "B1 " + i + "-" + j;
                        listo = true;
                        break;
                    }
                }
                if (listo) {
                    break;
                }
            }
        } else if (bus == 2 && piso == 2) {
            for (int i = 0; i < busBP2.length; i++) {
                for (int j = 0; j < busBP2[0].length; j++) {
                    if (busBP2[i][j] == null) {
                        pasajerosBP2[i][j] = nombre;
                        busBP2[i][j] = "B2 " + i + "-" + j;
                        listo = true;
                        break;
                    }
                }
                if (listo) {
                    break;
                }
            }
        }
    }

    public void imprimirBoleto(String nombre, int bus) {
        if (bus == 1) {
            for (int i = 0; i < busA.length; i++) {
                for (int j = 0; j < busA[0].length; j++) {
                    if ((pasajerosA[i][j] == nombre) && (busA[i][j] != null)) {
                        System.out.println("---------------------------");
                        System.out.println("Nombre: " + pasajerosA[i][j]);
                        System.out.println("Ubicacion: " + busA[i][j]);
                        System.out.println("Costo: $15.000");
                        System.out.println("---------------------------");
                        break;
                    }
                }
            }
        } else if (bus == 2) {
            for (int i = 0; i < busBP1.length; i++) {
                for (int j = 0; j < busBP1[0].length; j++) {
                    if ((pasajerosBP1[i][j] == nombre) && (busBP1[i][j] != null)) {
                        System.out.println("---------------------------");
                        System.out.println("Nombre: " + pasajerosBP1[i][j]);
                        System.out.println("Ubicacion: " + busBP1[i][j]);
                        System.out.println("Costo: $25.000");
                        System.out.println("---------------------------");
                        break;
                    }
                }
            }
            for (int i = 0; i < busBP2.length; i++) {
                for (int j = 0; j < busBP2[0].length; j++) {
                    if ((pasajerosBP2[i][j] == nombre) && (busBP2[i][j] != null)) {
                        System.out.println("---------------------------");
                        System.out.println("Nombre: " + pasajerosBP2[i][j]);
                        System.out.println("Ubicacion: " + busBP2[i][j]);
                        System.out.println("Costo: $20.000");
                        System.out.println("---------------------------");
                        break;
                    }
                }
            }
        }
    }

    public void comprarBoleto() {
        int bus = 0, asiento = 0, piso = 0, fila = 0, columna = 0;
        String nombre = "";
        System.out.println("Seleccione el bus\n1: Bus de un piso\n2: Bus de 2 pisos");
        bus = sc.nextInt();
        if (bus == 1) {
            if (asientosVacios(bus, piso)) {
                sc.nextLine();
                System.out.println("Escribe tu nombre");
                nombre = sc.nextLine();
                System.out.println("Seleccione\n1: Elegir asiento\n2: Asiento aleatorio");
                asiento = sc.nextInt();
                if (asiento == 1) {
                    sc.nextLine();
                    System.out.println("Ocupacion del Bus");
                    mostrarBus(1, 0);
                    System.out.println("Elegir numero de fila");
                    fila = sc.nextInt();
                    System.out.println("Elegir numero de columna");
                    columna = sc.nextInt();
                    pasajerosA[fila][columna] = nombre;
                    busA[fila][columna] = "A " + fila + "-" + columna;
                } else {
                    asientoRandom(bus, piso, nombre);
                }
            } else {
                System.out.println("No hay sientos disponibles");
            }
        } else if (bus == 2) {
            System.out.println("Elige el piso\n1: Primer piso\n2: Segundo piso");
            piso = sc.nextInt();
            if (asientosVacios(bus, piso)) {
                sc.nextLine();
                System.out.println("Escribe tu nombre");
                nombre = sc.nextLine();
                if (piso == 1) {
                    System.out.println("Seleccione\n1: Elegir asiento\n2: Asiento aleatorio");
                    asiento = sc.nextInt();
                    if (asiento == 1) {
                        sc.nextLine();
                        System.out.println("Ocupacion del Bus");
                        mostrarBus(2, 1);
                        System.out.println("Elegir numero de fila");
                        fila = sc.nextInt();
                        System.out.println("Elegir numero de columna");
                        columna = sc.nextInt();
                        pasajerosBP1[fila][columna] = nombre;
                        busBP1[fila][columna] = "B1 " + fila + "-" + columna;
                    } else {
                        asientoRandom(bus, piso, nombre);
                    }
                } else {
                    System.out.println("Seleccione\n1: Elegir asiento\n2: Asiento aleatorio");
                    asiento = sc.nextInt();
                    if (asiento == 1) {
                        sc.nextLine();
                        System.out.println("Ocupacion del Bus");
                        mostrarBus(2, 2);
                        System.out.println("Elegir numero de fila");
                        fila = sc.nextInt();
                        System.out.println("Elegir numero de columna");
                        columna = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Escribe tu nombre");
                        nombre = sc.nextLine();
                        pasajerosBP2[fila][columna] = nombre;
                        busBP2[fila][columna] = "B2 " + fila + "-" + columna;
                    } else {
                        asientoRandom(bus, piso, nombre);
                    }
                }
            } else {
                System.out.println("No hay asientos disponibles");
            }
        }
        imprimirBoleto(nombre, bus);
    }

    public void buscarReserva() {
        int bus = 0, fila = 0, columna = 0, piso = 0;
        System.out.println("Seleccione el bus\n1: Bus de un piso\n2: Bus de 2 pisos");
        bus = sc.nextInt();
        String[][] pasaj= pasajerosA;
        String[][] buss = busA;
        if (bus == 1) {
            buss = busA;
            pasaj=pasajerosA;
        } else {
            System.out.println("Elige el piso\n1: Primer piso\n2: Segundo piso");
            piso = sc.nextInt();
            if (bus == 2 && piso == 1) {
                buss = busBP1;
                pasaj=pasajerosBP1;
            } else {
                buss = busBP2;
                pasaj=pasajerosBP2;
            }
        }
        System.out.println("Digite el numero que aparece antes del guión en su boleto");
        fila = sc.nextInt();
        System.out.println("Digite el numero que aparece despues del guión en su boleto");
        columna = sc.nextInt();
        boolean listo = false;
        for (int i = 0; i < buss.length; i++) {
            for (int j = 0; j < buss[0].length; j++) {
                if(buss[i][j]!=null){
                    if (fila == i && columna == j) {
                    System.out.println("---------------------------");
                    System.out.println("Nombre: " + pasaj[i][j]);
                    System.out.println("Ubicacion: " + buss[i][j]);
                    System.out.println("Costo: $15.000");
                    System.out.println("---------------------------");
                    listo = true;
                    break;
                    }
                }
            }
            if (listo) {
                break;
            }
        }
        if(listo==false){
            System.out.println("Reserva no encontrada");
        }
    }
}