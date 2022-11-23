/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2uf1ejercicio2;

import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class Examen2UF1Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max, mini; 
        double far;
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe la temperatura minima");
        mini=sc.nextInt();
        System.out.println("Escribe la temperatura maxima");
        max=sc.nextInt();
        
            int i;
            for (i = mini; i <= max; i++) {
                far=(i*9/5)+32;
            System.out.println("Grados Celcios | Grados Fahrenheit");
            System.out.println(i+"C -- "+far+"F"); 
            }    
    } 
}
