/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayrandom;

import Utilitats.Utilitats;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class ArrayRandom {

    /**Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
    utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
    cuántos valores del array son igual o superiores a R.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int []array = new int [11];
        iniciArray(array);
        Utilitats.mostrarArray(array);
        System.out.println("Escribe un numero");
        int n=sc.nextInt();//valor R
        int cont=contador(array,n);
        System.out.println("Hay "+cont+" valores superiores a " +n);
    }
    
    public static void iniciArray(int array[]){
        Random r=new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=r.nextInt(1, 50);
        }
    }
    
    public static int contador(int array[], int n){
        int cont=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=n){
                cont++;
            }
        }
        return cont;
    }
}
