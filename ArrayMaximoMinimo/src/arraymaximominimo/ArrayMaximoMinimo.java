/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymaximominimo;

import Utilitats.Utilitats;
import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class ArrayMaximoMinimo {

    /**Crea un programa que pida diez números reales por teclado, los almacene en un array, y
       luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int []array_numeros= new int [6];
        int max=array_numeros[0], min=array_numeros[0];
               
        for (int i = 0; i < array_numeros.length; i++) {
          System.out.print("Introduce 6 numeros " +(i+1)+"=");
          array_numeros[i] = sc.nextInt();  
        }
        Utilitats.mostrarArray(array_numeros);
        
        for (int i = 0; i < array_numeros.length; i++) {
            if(array_numeros[i]>max){
                max=array_numeros[i];
            }
            if (array_numeros[i]<min){
                min=array_numeros[i];
            }
        }
        System.out.println("El maximo es " +max+ " y el minimo es " +min);
    }
}
