/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rps;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class RPS {

    /**
     * @param args Rock, Paper, Scissors
     */
    public static void main(String[] args) {
        int match = jugada();
        System.out.println(match);
        int match_comp= jugada_ordenador();
        System.out.println(match_comp);
        
    }
    
    public static int jugada (){
        int n;
        Scanner sc = new Scanner (System.in);
        do{
        System.out.println("Escoje un numero para tirar. Piedra (0), papel (1), tijera (2)");
        n = sc.nextInt();
        
        }while(n<0||n>2);
        if(n==0)
        {
            System.out.println("Piedra");
        }
        else if (n==1){
            System.out.println("Papel");
        }
        else if (n==2){
            System.out.println("Tijera");
        }
        return n;
    }
    public static int jugada_ordenador (){
        Random r = new Random();
        int j = r.nextInt(2);
        System.out.println("El odenador escoje "+j);
        if(j==0){
            System.out.println("Piedra");
        }
        else if (j==1){
            System.out.println("Papel");
        }
        else if (j==2){
            System.out.println("Tijera");
        }
        return j;
    }
    
    public static void imp_jugada(int player){
        
        System.out.println("Piedra");
        System.out.println("Papel");
        System.out.println("Tijera");
    }
    
    public static int ganador (int choose_player1, int choose_player2){
        return 0;
    }
    
    public static void imp_ganador (int ganador){
        System.out.println("HAS GANADO");
        System.out.println("HA GANADO EL ORDENADOR");
    }
    
    public static void marcador (int point_player1, int point_player2){
        
    }
}
