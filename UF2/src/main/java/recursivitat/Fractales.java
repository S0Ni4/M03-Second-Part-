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
public class Fractales {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon lado del primer cuadrado");
        int lado = sc.nextInt();
        int perimetro_total=cuadrado(lado);
        System.out.println("Perimetro total "+perimetro_total);
    }
    
    public static int cuadrado(int lado){
        if(lado==0){
            return 0;
        }
        else if(lado==1){
            return 4*lado;
        }
        else if(lado>1){
            return 4*lado + 4*cuadrado(lado/2);
        }
        return -1;
    }
}
