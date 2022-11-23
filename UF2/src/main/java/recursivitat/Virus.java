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
public class Virus {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cantidad de dias");
        int dia = sc.nextInt();
        int res=viruz(dia);
        System.out.println("El dia " +dia+ " habrá " +res+ " virus");
    }
    
    private static int viruz(int dia){
        if(dia==1){
            return 1;
        }
        else if(dia>1){
            return 3*viruz(dia-1);
        }
        return -1;
    }
}
