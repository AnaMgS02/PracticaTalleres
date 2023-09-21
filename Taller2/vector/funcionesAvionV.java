package Taller2.vector;

import java.util.Scanner;

public class FuncionesAvionV {
    Scanner sc = new Scanner(System.in);
    public String[] Tiquete = new String[13];
    public String[] pasajeros = new String[13];
    public String[] asientos = new String[13];// "F0","F1","F2","F3","F4","T5","T6","T7","T8","T9","T10","T11","T12"
    public double[] precioBoleto = new double[13];

    public boolean asientosVacios() {
        boolean estado = false;
        int contF = 0;
        int contT = 0;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] == null) {
                estado = true;
                if (i < 5) {
                    contF++;
                } else {
                    contT++;
                }
            } else {
                estado = false;
            }
        }
        System.out.println("|Asisentos disponibles\n|Primera clase: " + contF + "\n|Turista: " + contT);
        return estado;
    }

    public double precio(int clase) {
        double precioT = 0;
        int precioBase = 85000;
        double combustible = precioBase * 0.15;
        double administracion = precioBase * 0.07;
        double seguro = precioBase * 0.10;
        double vClase = 0;
        if (clase == 1) {
            vClase = (precioBase + combustible + administracion + seguro) * 0.65;
            precioT = (precioBase + combustible + administracion + seguro + vClase);
        } else if (clase == 2) {
            precioT = (precioBase + combustible + administracion + seguro);
        } else {
            System.out.println("Clase invalida");
        }
        /*
         * System.out.println("Detalles de cobro");
         * System.out.println("Precio de vuelo base: "+precioBase);
         * System.out.println("Combustible 15%: " + combustible);
         * System.out.println("Administración 7%: " + administracion);
         * System.out.println("Seguro 10%: " + seguro);
         * System.out.println("Asiento en clase: " +clase+": "+ vClase);
         * System.out.println("Valor Total: " + precioT);*/
        return precioT;
    }

    public void comprarBoleto(String nombre, int clase) {
        if (asientosVacios()) {
            if (clase == 1) {
                int i = 0;
                for (i = 0; i < 5; i++) {
                    if (asientos[i] == null && pasajeros[i] == null) {
                        asientos[i] = "F" + i;
                        pasajeros[i] = nombre;
                        System.out.println("------------------");
                        System.out.println("Asiento asignado");
                        System.out.println("------------------");
                        precioBoleto[i] = precio(clase);
                        break;
                    } else {
                        continue;
                    }
                }
            } else {
                int i = 0;
                for (i = 5; i < 13; i++) {
                    if (asientos[i] == null && pasajeros[i] == null) {
                        asientos[i] = "T" + i;
                        pasajeros[i] = nombre;
                        System.out.println("------------------");
                        System.out.println("Asiento asignado");
                        System.out.println("------------------");
                        precioBoleto[i] = (precio(clase));
                        break;
                    } else {
                        continue;
                    }
                }
            }
            VerTiquete(nombre, clase);
        } else {
            System.out.println("------------------");
            System.out.println("El avión está lleno");
            System.out.println("------------------");
        }
    }

    public void VerTiquete(String nombre, int clase) {
        if (clase == 1) {
            for (int i = 0; i < pasajeros.length; i++) {
                if (pasajeros[i].equals(nombre)) {
                    System.out.println("\n###############################");
                    System.out.println("|Informacion de tiquete");
                    System.out.println("|Nombre: " + pasajeros[i]);
                    System.out.println("|Asiento: " + asientos[i]);
                    System.out.println("|Precio: " + precioBoleto[i]);
                    System.out.println("###############################");
                    break;
                } else {
                }
            }
        } else {
            for (int i = 5; i < pasajeros.length; i++) {
                if (pasajeros[i].equals(nombre)) {
                    System.out.println("\n###############################");
                    System.out.println("|Informacion de tiquete");
                    System.out.println("|Nombre: " + pasajeros[i]);
                    System.out.println("|Asiento: " + asientos[i]);
                    System.out.println("|Precio: " + precioBoleto[i]);
                    System.out.println("\n###############################");
                    break;
                } else {
                }
            }
        }
    }

    public void mostrarOcupacion(int clase) {
        if (clase == 1) {
            System.out.println("Primera clase");
            for (int i = 0; i < 5; i++) {
                if (asientos[i] == null) {
                    System.out.println("||F" + i + ": Disponible");
                } else {
                    System.out.println("||" + asientos[i] + ": Ocupado por " + pasajeros[i]);
                }
            }
        } else if (clase == 2) {
            System.out.println("Clase turista");
            for (int i = 5; i < 13; i++) {
                if (asientos[i] == null) {
                    System.out.println("||T" + i + ": Disponible");
                } else {
                    System.out.println("||" + asientos[i] + ": Ocupado por " + pasajeros[i]);
                }
            }
        } else {
            System.out.println("La clase ingresada no existe");
        }
    }
}
