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
public class Conejos {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime en que mes quieres saber cuantos conejos tendras");
        int mes=sc.nextInt();
        int conejos=rabbit(mes);
        System.out.println("En el mes "+mes+" tendras "+conejos+" conejos.");    
    }
    
    public static int rabbit(int mes){
        
        if(mes<=1){
            return 1;
        }
        else if (mes>1){
            return rabbit(mes-1)+rabbit(mes-2);    
        }
        return -1;
    }
}
