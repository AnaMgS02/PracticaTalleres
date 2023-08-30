package Quiz1;

import java.util.Scanner;

public class FuncionesCine {
    // Sala1
    public String[] S1A = new String[7];// n, n, movR, movR, movR, n, n
    public String[] S1B = new String[7];// -10, n, n, n, n, n, -10
    public String[] S1C = new String[7];// -10, n, Aud, Aud, Aud, n, -10
    public String[] s1PersonasA = new String[7];
    public String[] s1PersonasB = new String[7];
    public String[] s1PersonasC = new String[7];
    public double[] s1PrecioA = new double[7];
    public double[] s1PrecioB = new double[7];
    public double[] s1PrecioC = new double[7];
    // Sala2
    public String[] S2A = new String[7];// -10, n, movR, movR, movR, n, -10
    public String[] S2B = new String[7];// n, n, Aud, Aud, Aud, n, n
    public String[] S2C = new String[7];// n, Aud, Aud, Aud, Aud, Aud, n
    public String[] s2PersonasA = new String[7];
    public String[] s2PersonasB = new String[7];
    public String[] s2PersonasC = new String[7];
    public double[] s2PrecioA = new double[7];
    public double[] s2PrecioB = new double[7];
    public double[] s2PrecioC = new double[7];

    // tipoAsiento=1:Con -10%, 2:Mov Redc, 3:Audio Env, 4:Normal
    // sala= 1 || 2
    public int disponibilidad(int sala, int tipoAsiento) {
        int contN = 0, contMR = 0, contDes = 0, contAud = 0;
        if (sala == 1) {
            for (int i = 0; i < S1A.length; i++) {
                if (i > 1 && i < 5) {
                    if (S1A[i] == null) {
                        contMR++;
                    } else {
                    }
                } else {
                    if (S1A[i] == null) {
                        contN++;
                    } else {
                    }
                }
            }
            for (int i = 0; i < S1B.length; i++) {
                if (i == 0 || i == 6) {
                    if (S1B[i] == null) {
                        contDes++;
                    } else {
                    }
                } else {
                    if (S1B[i] == null) {
                        contN++;
                    } else {
                    }
                }
            }
            for (int i = 0; i < S1C.length; i++) {
                if (i == 0 || i == 6) {
                    if (S1C[i] == null) {
                        contDes++;
                    } else {
                    }
                } else if (i == 1 || i == 5) {
                    if (S1C[i] == null) {
                        contN++;
                    } else {
                    }
                } else {
                    if (S1C[i] == null) {
                        contAud++;
                    } else {
                    }
                }
            }
        } else {
            for (int i = 0; i < S2A.length; i++) {
                if (i == 0 || i == 6) {
                    if (S2A[i] == null) {
                        contDes++;
                    } else {
                    }
                } else if (i == 1 || i == 5) {
                    if (S2A[i] == null) {
                        contN++;
                    } else {
                    }
                } else {
                    if (S2A[i] == null) {
                        contMR++;
                    } else {
                    }
                }
            }
            for (int i = 0; i < S2B.length; i++) {
                if (i > 1 || i < 5) {
                    if (S2B[i] == null) {
                        contAud++;
                    } else {
                    }
                } else {
                    if (S2B[i] == null) {
                        contN++;
                    } else {
                    }
                }
            }
            for (int i = 0; i < S2C.length; i++) {
                if (i == 0 || i == 6) {
                    if (S2C[i] == null) {
                        contN++;
                    } else {
                    }
                } else {
                    if (S2C[i] == null) {
                        contAud++;
                    } else {
                    }
                }
            }
        }
        int dispo = 0;
        switch (tipoAsiento) {
            case 1:
                dispo = contDes;
                break;
            case 2:
                dispo = contMR;
                break;
            case 3:
                dispo = contAud;
                break;
            case 4:
                dispo = contN;
                break;
            default:
                break;
        }
        return dispo;
    }

    public double precio(int sala, int tipoAsiento) {
        double valorT = 0;
        int base = 0, gafas3D = 0;
        if (sala == 1) {
            base = 12500;
        } else {
            base = 14500;
            gafas3D = 2800;
        }
        if ((disponibilidad(sala, tipoAsiento)) > 0) {
            switch (tipoAsiento) {
                case 1:
                    double desc = base * 0.10;
                    valorT = base - desc;
                    break;
                case 2:
                    double movR = base * 0.15;
                    valorT = base - movR;
                    break;
                case 3:
                    double audEnv = base * 0.25;
                    valorT = base + audEnv;
                    break;
                case 4:
                    valorT = base;
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("No hay disponibilidad");
        }
        return valorT + gafas3D;
    }

    Scanner leer = new Scanner(System.in);

    public String reservarS1(String nombre) {
        int n = 0;
        int tipoAsiento = 0;
        System.out.println("Pon el numero segun la fila en la que vas a reservar");
        System.out.println("1. Fila 1 \n2. Fila 2 \n3. Fila 3");
        int opcionFila = leer.nextInt();
        switch (opcionFila) {
            case 1:
                System.out.println("Las ubicaciones disponibles de la fila son: ");
                for (int i = 0; i < S1A.length; i++) {
                    if (i < 2 && S1A[i] == null) {
                        System.out.println(i + ": " + "General");
                        tipoAsiento = 4;
                    } else if (i >= 2 && i <= 4 && S1A[i] == null) {
                        System.out.println(i + ": " + "Movilidad reducida");
                        tipoAsiento = 2;
                    } else if (i > 4 && S1A[i] == null) {
                        System.out.println(i + ": " + "General");
                        tipoAsiento = 4;
                    }
                }
                System.out.println("Que asiento vas a ocupar");
                System.out.print("Opcion: ");
                n = leer.nextInt();
                S1A[n] = "A" + n;
                s1PrecioA[n] = precio(1, tipoAsiento);
                s1PersonasA[n] = nombre;
                break;
            case 2:
                System.out.println("Las ubicaciones disponibles de la fila son: ");
                for (int i = 0; i < S1B.length; i++) {
                    if (i < 1 && S1B[i] == null) {
                        System.out.println(i + ": " + "Descuento 10%");
                        tipoAsiento = 1;
                    } else if (i >= 1 && i <= 5 && S1B[i] == null) {
                        System.out.println(i + ": " + "General");
                        tipoAsiento = 4;
                    } else if (i > 5 && S1B[i] == null) {
                        System.out.println(i + ": " + "Descuento 10%");
                        tipoAsiento = 1;
                    }
                }
                System.out.println("Que asiento vas a ocupar");
                System.out.print("Opcion: ");
                n = leer.nextInt();
                S1B[n] = "B" + n;
                s1PrecioB[n] = precio(1, tipoAsiento);
                s1PersonasB[n] = nombre;
                break;
            case 3:
                System.out.println("Las ubicaciones disponibles de la fila son: ");
                for (int i = 0; i < S1C.length; i++) {
                    if (i < 1) {
                        System.out.println(i + ": " + "Descuento 10%");
                    } else if (i >= 1 && i <= 1 && S1C[i] == null) {
                        System.out.println(i + ": " + "General");
                        tipoAsiento = 4;
                    } else if (i >= 2 && i <= 4 && S1C[i] == null) {
                        System.out.println(i + ": " + "Sonido envolvente y vibracion en la silla");
                        tipoAsiento = 3;
                    } else if (i >= 5 && i <= 5 && S1C[i] == null) {
                        System.out.println(i + ": " + "General");
                        tipoAsiento = 4;
                    } else if (i > 5 && S1C[i] == null) {
                        System.out.println(i + ": " + "Descuento 10%");
                        tipoAsiento = 1;
                    }
                }
                System.out.println("Que asiento vas a ocupar");
                System.out.print("Opcion: ");
                n = leer.nextInt();
                S1C[n] = "C" + n;
                s1PrecioC[n] = precio(1, tipoAsiento);
                s1PersonasC[n] = nombre;
                break;
            default:
                break;

        }
        return nombre;
    }

    public String reservarS2(String nombre) {
        int n = 0;
        int tipoAsiento = 0;
        System.out.println("Pon el numero segun la fila en la que vas a reservar");
        System.out.println("1. Fila 1 \n2. Fila 2 \n3. Fila 3");
        int opcionFila = leer.nextInt();
        switch (opcionFila) {
            case 1:
                System.out.println("Las ubicaciones disponibles de la fila son: ");// -10, n, movR, movR, movR, n, -10
                for (int i = 0; i < S2A.length; i++) {
                    if (i < 1 && S2A[i] == null) {
                        System.out.println(i + ": " + "Descuento 10%");
                        tipoAsiento = 1;
                    } else if (i >= 1 && i <= 1 && S2A[i] == null) {
                        System.out.println(i + ": " + "General");
                        tipoAsiento = 4;
                    } else if (i >= 2 && i <= 4 && S2A[i] == null) {
                        System.out.println(i + ": " + "Movilidad reducida");
                        tipoAsiento = 2;
                    } else if (i >= 5 && i <= 5 && S2A[i] == null) {
                        System.out.println(i + ": " + "General");
                        tipoAsiento = 4;
                    } else if (i > 5 && S2A[i] == null) {
                        System.out.println(i + ": " + "Descuento 10%");
                        tipoAsiento = 1;
                    }
                }
                System.out.println("Que asiento vas a ocupar");
                System.out.print("Opcion: ");
                n = leer.nextInt();
                S2A[n] = "A" + n;
                s2PrecioA[n] = precio(1, tipoAsiento);
                s2PersonasA[n] = nombre;
                break;
            case 2:
                System.out.println("Las ubicaciones disponibles de la fila son: ");// n, n, Aud, Aud, Aud, n, n
                for (int i = 0; i < S2B.length; i++) {
                    if (i < 2 && S2B[i] == null) {
                        System.out.println(i + ": " + "Descuento 10%");
                        tipoAsiento = 1;
                    } else if (i >= 2 && i <= 4 && S2B[i] == null) {
                        System.out.println(i + ": " + "Sonido envolvente y vibracion en la silla");
                        tipoAsiento = 3;
                    } else if (i > 4 && S2B[i] == null) {
                        System.out.println(i + ": " + "General");
                        tipoAsiento = 4;
                    }
                }
                System.out.println("Que asiento vas a ocupar");
                System.out.print("Opcion: ");
                n = leer.nextInt();
                S2B[n] = "B" + n;
                s2PrecioB[n] = precio(1, tipoAsiento);
                s2PersonasB[n] = nombre;
                break;
            case 3:
                System.out.println("Las ubicaciones disponibles de la fila son: ");// n, Aud, Aud, Aud, Aud, Aud, n
                for (int i = 0; i < S2C.length; i++) {
                    if (i < 1) {
                        System.out.println(i + ": " + "General");
                        tipoAsiento = 1;
                    } else if (i >= 1 && i <= 5 && S2C[i] == null) {
                        System.out.println(i + ": " + "Sonido envolvente y vibracion en la silla");
                        tipoAsiento = 3;
                    } else if (i >= 6 && S2C[i] == null) {
                        System.out.println(i + ": " + "General");
                        tipoAsiento = 4;

                    }
                }
                System.out.println("Que asiento vas a ocupar");
                System.out.print("Opcion: ");
                n = leer.nextInt();
                S2C[n] = "C" + n;
                s2PrecioC[n] = precio(1, tipoAsiento);
                s2PersonasC[n] = nombre;
                break;
            default:
                break;
        }
        return nombre;// podriamos retornar un id de reserva
    }

    public void mostrarReserva(int sala) {
        if (sala == 1) {
            System.out.println("Sala 1");
            for (int i = 0; i < S1A.length; i++) {
                if (S1A[i] == null) {
                } else {
                    System.out.println(S1A[i] + ": Reservado por " + s1PersonasA[i]);
                }
            }
            for (int i = 0; i < S1B.length; i++) {
                if (S1B[i] == null) {
                } else {
                    System.out.println(S1B[i] + ": Reservado por " + s1PersonasB[i]);
                }
            }
            for (int i = 0; i < S1C.length; i++) {
                if (S1C[i] == null) {
                } else {
                    System.out.println(S1C[i] + ": Reservado por " + s1PersonasC[i]);
                }
            }
        } else if (sala == 2) {
            System.out.println("Sala 2");
            for (int i = 0; i < S2A.length; i++) {
                if (S2A[i] == null) {
                } else {
                    System.out.println(S2A[i] + ": Reservado por " + s2PersonasA[i]);
                }
            }
            for (int i = 0; i < S2B.length; i++) {
                if (S2B[i] == null) {
                } else {
                    System.out.println(S2B[i] + ": Reservado por " + s2PersonasB[i]);
                }
            }
            for (int i = 0; i < S2C.length; i++) {
                if (S2C[i] == null) {
                } else {
                    System.out.println(S2C[i] + ": Reservado por " + s2PersonasC[i]);
                }
            }
        } else {
            System.out.println("Sala no disponible");
        }
    }

    public void mostrarSala(int sala) {
        if (sala == 1) {
            System.out.println("Sala 1");
            for (int i = 0; i < S1A.length; i++) {
                if (S1A[i] == null) {
                    System.out.println("A" + i + ": Disponible");
                } else {
                    System.out.println(S1A[i] + ": Ocupado por " + s1PersonasA[i]);
                }
            }
            for (int i = 0; i < S1B.length; i++) {
                if (S1B[i] == null) {
                    System.out.println("B" + i + ": Disponible");
                } else {
                    System.out.println(S1B[i] + ": Ocupado por " + s1PersonasB[i]);
                }
            }
            for (int i = 0; i < S1C.length; i++) {
                if (S1C[i] == null) {
                    System.out.println("C" + i + ": Disponible");
                } else {
                    System.out.println(S1C[i] + ": Ocupado por " + s1PersonasC[i]);
                }
            }
        } else if (sala == 2) {
            System.out.println("Sala 2");
            for (int i = 0; i < S2A.length; i++) {
                if (S2A[i] == null) {
                    System.out.println("A" + i + ": Disponible");
                } else {
                    System.out.println(S2A[i] + ": Ocupado por " + s2PersonasA[i]);
                }
            }
            for (int i = 0; i < S2B.length; i++) {
                if (S2B[i] == null) {
                    System.out.println("B" + i + ": Disponible");
                } else {
                    System.out.println(S2B[i] + ": Ocupado por " + s2PersonasB[i]);
                }
            }
            for (int i = 0; i < S2C.length; i++) {
                if (S2C[i] == null) {
                    System.out.println("C" + i + ": Disponible");
                } else {
                    System.out.println(S2C[i] + ": Ocupado por " + s2PersonasC[i]);
                }
            }
        } else {
            System.out.println("Sala no disponible");
        }
    }
}
