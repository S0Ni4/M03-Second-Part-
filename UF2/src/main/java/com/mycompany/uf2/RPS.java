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
public class RPS {
     public static void main(String[] args) {
      int player1=0, player2=0, jugadas=0;
      do{
      int match = jugada();
      int match_comp = jugada_ordenador();
      imp_jugada(match);
      int winner = ganador(match, match_comp);
      imp_ganador(winner);
      if(winner==1){
          player1++;
      }
      else if(winner==2){
          player2++;
      }
      marcador(player1, player2);
      }while(player1<3 && player2<3 && jugadas<6);
    }
    
    public static int jugada (){
        int n;
        Scanner sc = new Scanner (System.in);
        do{
        System.out.println("Escoje un numero para tirar. Piedra (0), papel (1), tijera (2)");
        n = sc.nextInt();
        }while(n<0||n>2);
        
        return n;
    }
    
    public static int jugada_ordenador (){
        Random r = new Random();
        int j = r.nextInt(3);
        System.out.println("El odenador escoje "+j);
        return j;
    }
    
    public static void imp_jugada(int player){
        if(player==0)
        {
            System.out.println("Ha escogido Piedra");
        }
        else if (player==1){
            System.out.println("Ha escogido Papel");
        }
        else if (player==2){
            System.out.println("Ha escogido Tijera");
        }
    }
    
    public static int ganador (int choose_player1, int choose_player2){
        int resultado=0;
        switch (choose_player1){
        case 0:
        if(choose_player2==0){
            resultado=0;
        }
        else if (choose_player2==1){
            resultado=2;
        }
        else if (choose_player2==2){
            resultado=1;
        }
        break;
        
        case 1:
        if(choose_player2==0){
            resultado=1;
        }
        else if (choose_player2==1){
            resultado=0;
        }
        else if (choose_player2==2){
            resultado=2;
        }
        break;
        
        case 2:
        if(choose_player2==0){
            resultado=2;
        }
        else if (choose_player2==1){
            resultado=1;
        }
        else if (choose_player2==2){
            resultado=0;
        }
        break;
        }
        return resultado;
    }
    
    public static void imp_ganador (int ganador){
        
        if (ganador==0){
            System.out.println("EMPATE");
        }
        else if (ganador==1){
           System.out.println("HAS GANADO"); 
        }
        else if (ganador==2){
        System.out.println("HA GANADO EL ORDENADOR");
        }
    }
    
    public static void marcador (int point_player1, int point_player2){
        System.out.println("-----------------------------------------");
        System.out.println("************PUNTUACION TOTAL*************");
        System.out.println("Tu Puntuacion: " +point_player1);
        System.out.println("Puntuacion del ordenador: " +point_player2);
        System.out.println("-----------------------------------------");
   }
}

