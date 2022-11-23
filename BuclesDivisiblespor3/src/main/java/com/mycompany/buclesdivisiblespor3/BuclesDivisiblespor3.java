/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.buclesdivisiblespor3;

import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class BuclesDivisiblespor3 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int n, cont=0, acum_num=0, cont_num=0;
       do{
           System.out.println("Pon numeros");
           n=sc.nextInt();
           ++cont_num;
           if(n%3==0){
               acum_num=acum_num+n;
               ++cont; 
           }
       }while(cont<3);
        System.out.println("Has introducido " +cont);
        System.out.println("La suma entre los tres numeros es: " + acum_num);
    }
}
