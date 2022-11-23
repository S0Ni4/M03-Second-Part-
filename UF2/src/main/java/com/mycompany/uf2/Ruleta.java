/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uf2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class Ruleta {
    
    public static void main(String[] args) {
        int saldo=100;
        int dinero_ganado;
        char seguir;
        do{
        int bola_player=pedirNumero();
        int apuesta=pedirDineroApuesta(saldo);
        saldo=saldo-apuesta;
        System.out.println("saldo " +saldo);
        int ball = caidaBola();
        pintaAsteriscos(ball);
        
        boolean winner=comprobarResultado(ball, bola_player);
        if(winner==true){
            System.out.println("HAS GANADO");
            dinero_ganado=ganancias(apuesta, bola_player);
            saldo=saldo+dinero_ganado;
        }
        else{
            System.out.println("¡¡NO HAS ACERTADO!!");
        }
        seguir = seguirJugando();
        }while(continuarJugando(seguir, saldo));
        
        System.out.println("Tu saldo es: " +saldo);
    }
    
    public static int caidaBola(){
        Random r = new Random();
        int bola = r.nextInt(37);
        return bola;
    }
    
    public static int pedirNumero(){
        Scanner sc = new Scanner (System.in);
        int n;
        do{
        System.out.println("Escoge un numero del 1 al 36 (37 impar) (38 par)");
        n = sc.nextInt();
        return n;
        }while(n<=0 || n>=39);
    }
    
    public static void pintaAsteriscos(int num){
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("->"+num);
    }
    
    public static int pedirDineroApuesta(int dinero_tienes){
        int money;
        Scanner sc = new Scanner (System.in);
        do{
        System.out.println("¿Cuanto dinero quieres apostar? Aun tienes " + dinero_tienes+ ".");
        money = sc.nextInt();
        }while(money>dinero_tienes && money<=0);
        return money;
    }
    
    public static boolean comprobarResultado(int bola, int num_apostado){ 
        if(bola%3==0 && num_apostado==37){
            return true;
        }
        else if (bola%2==0 && num_apostado==38){
            return true;
        }
        else if (bola==num_apostado){
            return true;
        }
        else{
        return false;
        }
    }
    
    public static int ganancias(int dinero_apostado, int num_apostado){
        int dinero_ganado=0;
        if(num_apostado<=36 && num_apostado>0){
            dinero_ganado=dinero_apostado*35;
        }
        else if (num_apostado==37 || num_apostado==38){
            dinero_ganado=dinero_apostado*2;
        }
        return dinero_ganado;
    }
    
    public static char seguirJugando(){
        char res;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quieres seguir judando? SÍ(s/S) o NO(n/N)");
        res=sc.next().charAt(0);
        }while(!(res=='s' || res=='S' || res=='n' || res=='N'));
        return res;
    }
    
    /*public static String seguirJugando(){
        String res;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("¿Quieres seguir judando? SÍ o NO");
        res=sc.nextLine();
        }while(!(res.equlsIgnoreCase("Si") || res.equalsIgnoreCase("No")));
        return res;
    }*/
    
    public static boolean continuarJugando(char respuesta, int dinero){
        if((respuesta=='s' || respuesta=='S') && dinero>0){
            return true;
        }
        else{
            return false;
        }
    }
}
