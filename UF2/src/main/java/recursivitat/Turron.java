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
public class Turron {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cantidad de dias");
        int dia=sc.nextInt();
        int trozo=trozo(dia);
        int caloria=caloria(dia);
        System.out.println("En " +dia+ " dias habrá consumido " +trozo+ " trozos y " +caloria+ " calorias.");
    }
    
    public static int trozo(int dia){
        if (dia==0){
            return 0; 
        }
        else if (dia==1){
            return 4;
        }
        else if(dia%3==0){
            return 1+trozo(dia-1);
        }
        else if(dia>1){
            return 4+trozo(dia-1);
        }
        
        return -1;
    }
    
    public static int caloria(int dia){
        int kcal=91;
        if (dia==0){
            return 0; 
        }
        else if (dia==1){
            return kcal*4;
        }
        else if(dia%3==0){
            return kcal+caloria(dia-1);
        }
        else if(dia>1){
            return kcal*4+caloria(dia-1);
        }
        
        return -1;
    }
}
