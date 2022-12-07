/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2arrays;

import Utilitats.Utilitats;
import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class Array2Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array=new int[3];
        int[] array2=new int[3];
        valor(array);
        Utilitats.mostrarArray(array);
        segundoValor(array2);
        Utilitats.mostrarArray(array2);
        boolean igual=validacion(array, array2);
    }
    
    public static void valor(int[]array){
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Escribe un numero posicion " + (i+1));
            array[i]=sc.nextInt();
        }       
    }
    
    public static void segundoValor(int[]array2){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Escribe un numero posicion " + (i+1));
            array2[i]=sc.nextInt();
        }
    }

    private static boolean validacion(int[] array, int[] array2) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=array2[i]){
                System.out.println("Los numeros son diferentes");
                return false;
            }
        }
        return true;
    }
}
