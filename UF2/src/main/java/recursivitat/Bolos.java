/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivitat;

import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class Bolos {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe numero de filas");
        int n = sc.nextInt();
        int bitlles = bitlles(n);
        System.out.println("El numero de bolos es " +bitlles);
    }
    
    private static int bitlles(int fileres){
        if(fileres==0){
            return 0;
        }
        else if(fileres==1){
            return 1;
        }
        else if (fileres>1){
            return fileres+bitlles(fileres-1);
        }

        return -1;
    }
}
