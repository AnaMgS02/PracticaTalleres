
public class fucionesCajero {
    public int[] cuentas = { 1001, 1002, 1003, 1004, 1005 };
    public int[] saldo = { 0, 0, 0, 0, 0 };
    String[] transacion = {};

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

    public boolean retiro(int cuenta, int valor) {
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
        if (valor > saldo[j]) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            System.out.println("Retiro realizado");
            return true;
        }
    }

    public void consignacion(int cuenta, int valor) {
        int i = 0;
        for (i = 0; i <= cuentas.length; i++) {
            if (cuenta == cuentas[i]) {
                break;
            }
        }
        int j = 0;
        for (j = 0; j <= saldo.length; j++) {
            if (i == j) {
                saldo[j] = saldo[j] + valor;
                System.out.println("Consignación realizada");
                break;
            }
        }
    }

    public void transacion(String movimiento) {
        int i = 0;
        for (i = 0; i < transacion.length; i++) {
        }
        transacion[i] = movimiento;
    }

    public void imprimirTransacion() {
        int i = 0;
        for (i = 0; i < transacion.length; i++) {
        }
        System.out.println("Movimiento: " + transacion[i]);
    }
}
