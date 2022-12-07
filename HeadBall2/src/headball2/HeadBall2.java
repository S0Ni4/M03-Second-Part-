/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package headball2;

import Utilitats.Utilitats;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class HeadBall2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]tarjetas=new int[4];
        int premio, monedas=0;
        boolean respuesta=true;
        do{
        llenarArrayMonedas(tarjetas);
        Utilitats.mostrarArray(tarjetas);
        int posicion=pedirPosicion(tarjetas.length);
        premio=devolverPremio(tarjetas,posicion);
        if(premio!=-1){
            monedas=monedas+premio;
            System.out.println("Llevas ganado "+ monedas);
            respuesta=pedirContinuarOPlantar();
        }
        else{
            monedas=0;
        }
        }while(premio!=-1 && (respuesta==true));
        System.out.println("Al final has ganado" + monedas);
    }

    private static void llenarArrayMonedas(int[] tarjetas) {
        Random r= new Random();
        //int monedas=r.nextInt(1,20);
        for (int i = 0; i < tarjetas.length; i++) {
           // tarjetas[i]=monedas;
            tarjetas[i]=r.nextInt(1,21);  
        } 
    ponerTarjetaRoja(tarjetas);
    }
    private static void ponerTarjetaRoja(int[] tarjetas) {
        Random r = new Random();
        int posicion=r.nextInt(0,4);
        tarjetas[posicion]=-1;
    }
    
    private static int pedirPosicion(int tope){
        Scanner sc = new Scanner(System.in);
        int pos;
        do{
            System.out.println("Pon posicion 1-"+tope);
            pos=sc.nextInt();
        }while(pos<1||pos>tope);
        return pos-1;
    }

    private static int devolverPremio(int[] tarjetas, int posicion) {
        if(tarjetas[posicion]!=-1){
            System.out.println("Has ganado"+tarjetas[posicion]+" monedas");
        }
        else{
            System.out.println("Tarjeta Roja. Perdiste");
        }
        return tarjetas[posicion];
    }

    private static boolean pedirContinuarOPlantar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres continuar(Si/No)");
        String frase=sc.next();
        if(frase.equalsIgnoreCase("Si"))
            return true;
        else
            return false;
    }
}
