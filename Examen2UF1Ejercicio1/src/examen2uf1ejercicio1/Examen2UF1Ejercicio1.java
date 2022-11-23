/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2uf1ejercicio1;

import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class Examen2UF1Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra;
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("¿Que tipo de dia es? Laborable(L/l), Sabado (S/s), Festivo(F/f)");
        letra = sc.next().charAt(0);
        if(letra=='L'|| letra=='l' || letra=='S' || letra=='s' || letra=='F' || letra=='f'){
                if(letra=='L' || letra=='l'){
                    System.out.println("¿Que tipo quieres? Tipo1(1) / Tipo2(2)");
                    n = sc.nextInt();
                    if(n==1){
                        System.out.println("Tu desayuno seran 2,00 euros");
                    }
                    else if (n==2){
                        System.out.println("Tu deasyuno seran 2,50 euros");
                    }
                }
                if(letra=='S' || letra=='s'){
                    System.out.println("¿Que tipo quieres? Tipo1(1) / Tipo2(2)");
                    n = sc.nextInt();
                    if(n==1){
                        System.out.println("Tu desayuno seran 2,20 euros");
                    }
                    else if (n==2){
                        System.out.println("Tu deasyuno seran 2,70 euros");
                    }
                }
                if(letra=='F' || letra=='f'){
                    System.out.println("¿Que tipo quieres? Tipo1(1) / Tipo2(2)");
                    n = sc.nextInt();
                    if(n==1){
                        System.out.println("Tu desayuno seran 2,30 euros");
                    }
                    else if (n==2){
                        System.out.println("Tu deasyuno seran 2,80 euros");
                    }
                }
        }
        else{
            System.out.println("OPCION INCORRECTA");
        }
    }
    
}
