/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraypositivonegativo;

import Utilitats.Utilitats;
import java.util.Scanner;

/**
 *Crea un programa que pida veinte números enteros por teclado, los almacene en un array y
luego muestre por separado la suma de todos los valores positivos y negativos.
 * @author somo4203
 */
public class ArrayPositivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int pos=0, neg=0;
        int array[]=new int [5];
        int val;
        System.out.println("Introduce valores");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce valor:");
            val=sc.nextInt();
            array[i]=val;
        }
        /*System.out.println("Muestro array");
        Utilitats.mostrarArray(array);*/
        for (int i = 0; i < array.length; i++) {
            if(array[i]>0){/*positivos*/
                pos=pos+array[i];
            }
            else if (array[i]<0){/*negativos*/
                neg=neg+array[i];
            }
        }
        System.out.println("Positivos " +pos);
        System.out.println("Negativos " +neg);
    }   
}
