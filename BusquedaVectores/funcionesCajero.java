package BusquedaVectores;

public class funcionesCajero {
    public int[] cuentas = { 1001, 1002, 1003, 1004, 1005 };
    public int[] saldo = { 0, 0, 0, 0, 0 };
    public String[] transacion = { "", "", "", "", "", "", "", "" };

    public boolean sesion(int cuenta) {
        boolean inicio = false;
        for (int i = 0; i <= cuentas.length; i++) {
            if (cuenta == cuentas[i]) {
                inicio = true;
                break;
            } else {
                inicio = false;
            }
        }
        return inicio;
    }

    public int consultaSaldo(int cuenta) {
        int i = 0;
        for (i = 0; i <= cuentas.length; i++) {
            if (cuenta == cuentas[i]) {
                break;
            }
        }
        int j = 0;
        for (j = 0; j <= saldo.length; j++) {
            if (i == j) {
                break;
            }
        }
        return saldo[j];
    }

    public void retiro(int cuenta, int valor) {
        int i = 0;
        for (i = 0; i <= cuentas.length; i++) {
            if (cuenta == cuentas[i]) {
                break;
            }
        }
        int j = 0;
        for (j = 0; j <= saldo.length; j++) {
            if (i == j) {
                break;
            }
        }
        if (valor < (saldo[j]) && valor < (saldo[j] + 500)) {
            System.out.println("Retiro realizado");
            saldo[j] -= valor + 500;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void consignacion(int cuenta, int valor) {
        int i = 0;
        for (i = 0; i <= cuentas.length; i++) {
            if (cuenta == cuentas[i]) {
                break;
            }
        }
        saldo[i] += valor;
        System.out.println("Consignación realizada");
    }

    public void movs(String movimiento) {
        int i = 0;
        if (transacion.length == i) {
            transacion[i] = movimiento;
        } else {
            for (i = 0; i < transacion.length; i++) {
                if (transacion[i].equals("")) {
                    transacion[i] = movimiento;
                    break;
                } else {
                }
            }
        }
    }

    public void imprimirTransacion() {
        int i = 0;
        for (i = 0; i < transacion.length; i++) {
            System.out.println(transacion[i]);
        }

    }
}
