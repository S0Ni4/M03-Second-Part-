/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayvalorespyq;

import Utilitats.Utilitats;
import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class ArrayValoresPyQ {

    /**. Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
     todos los valores desde P hasta Q, y lo muestre por pantalla.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un valor");
        int mini=sc.nextInt();
        System.out.println("Escribe otro valor");
        int max=sc.nextInt();
        final int size =max-mini+1;
        int[]array=new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]=mini;
            ++mini;   
        }
        
        Utilitats.mostrarArray(array);
    } 
}
