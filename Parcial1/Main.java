package Parcial1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FuncionesLab fc=new FuncionesLab();
        int volver=1;
        while(volver==1){
            System.out.println("Este programa le dirá si su laberinto tiene salida\ny le mostrará el camino para llegar a ella");
            System.out.println("Para ello deberá ingresar los datos del laberinto a continuación");
            fc.ingresarLabTec();
            fc.mostrarLab();
            fc.buscarCamino();
            fc.mostrarLab();
            System.out.println("SI desea volver a jugar presione 1");
            volver=sc.nextInt();
        }
    }
    
}
        

