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
public class Arañas {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la cantidad de arañas");
        int n = sc.nextInt();
        int potes= potes(n);
        System.out.println("Las arañas tienen " +potes+ " patas");
        int patas=patasPares(n);
        System.out.println("Las arañas mutantes tienen " +patas+ " patas");
    }
    
    private static int potes(int aranyes){
        if(aranyes==0){
            return 0;
        }
        if(aranyes==1){
            return 8;
        }
        else if(aranyes>1){
            return 8+potes(aranyes-1);
        }
        
        return -1;
    }
    
    private static int patasPares(int aranyes){
        if(aranyes==0){
            return 0;
        }
        else if (aranyes%2!=0)//impar
        {
         return 8+patasPares(aranyes-1);   
        }
        else if(aranyes%2==0){
            return 6+patasPares(aranyes-1);
        }
        return -1;
    }
}
