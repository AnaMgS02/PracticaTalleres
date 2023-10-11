package Parcial1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FuncionesLab fc=new FuncionesLab();
        int resp=0;
        int volver=1;
        while(volver==1){
            System.out.println("Dese ingresar los digitos para el laberinto manual(1) o desde un archivo(2)");
            resp=sc.nextInt();
            if(resp==1){
            System.out.println("Este programa le dirá si su laberinto tiene salida\ny le mostrará el camino para llegar a ella");
            System.out.println("Para ello deberá ingresar los datos del laberinto a continuación");
            fc.ingresarLabTec();
            }else{
                fc.leerMatrizArchivo("C:\\Users\\anita\\OneDrive\\Escritorio\\PracticaTalleres\\PracticaTalleres\\Parcial1\\laberinto.txt");
            }
            fc.mostrarLab();
            fc.marcarCamino();
            fc.buscarCamino();
            fc.marcarCamino();
            fc.buscarCamino2();
            System.out.println("SI desea volver a jugar presione 1");
            volver=sc.nextInt();
        }
    }
    
}
        

