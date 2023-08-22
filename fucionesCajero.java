public class fucionesCajero {
    public int[] cuentas = { 1001, 1002, 1003, 1004, 1005 };
    public int[] saldo = { 0, 0, 0, 0, 0 };
    String[] transacion = { "" };

    public int consultaSaldo(int cuenta){
        int i=0;
        for(i=0;i<=cuentas.length;i++){
            if(cuenta==cuentas[i]){
                break;
            }
        }
        int j=0;
        for(j=0;j<=saldo.length;j++){
            if(i==j){
                break;
            }
        }
        return saldo[j];
    }
}
