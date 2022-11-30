/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayvaloresnym;

import Utilitats.Utilitats;
import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class ArrayValoresNyM {

    /**. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
     escriba M en todas sus posiciones y lo muestre por pantalla.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe tamanyo array");
        int n = sc.nextInt();
        System.out.println("Escribe un numero");
        int valor=sc.nextInt();
        int array[]=new int[n];
        
        for (int i = 0; i < array.length; i++) {
            array[i]=valor;
        }
        Utilitats.mostrarArray(array);
    }  
}
