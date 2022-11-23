/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uf2;

import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class MayorEdad {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("¿Cual es tu edad?");
        int n = sc.nextInt();
        boolean old = EsMayorDeEdad(n);
        System.out.println(old);
    }
    
    public static boolean EsMayorDeEdad(int valor){
        if(valor>=18){  
            System.out.println("Eres mayor de edad");
            return true;
        }
        else if (valor<18){ 
            System.out.println("Eres menor de edad");
            return false;  
        }
        return true;
    }
}
