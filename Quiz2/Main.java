package Quiz2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FuncionesTriqui fc=new FuncionesTriqui();
        Scanner sc=new Scanner(System.in);
        int otra=1;
        while(otra==1){
        fc.jugar();
        System.out.println("Si desea jugar nuevamente dijite '1'");
        otra=sc.nextInt();
        }
    }

}
