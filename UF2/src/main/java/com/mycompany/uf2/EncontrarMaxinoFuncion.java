/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uf2;

import java.util.Scanner;

/**
 *MAYUSCULAS y F6 para ejecutar el programa en el que estes.
 * @author somo4203
 */
public class EncontrarMaxinoFuncion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);    
        System.out.println("Escribe un valor");
        double valor1 = sc.nextInt();
        System.out.println("Escribe un segundo valor");
        double valor2 = sc.nextInt();
        
        double maximo = maximo(valor1, valor2);
        System.out.println("El maximo: " +maximo);
        double minimo= minimo(valor1, valor2);
        System.out.println("El minimo: " +minimo);
    }
    
    public static double maximo(double valor1, double valor2) {
    double max;
    if (valor1 > valor2){
        max = valor1;
    }
        
    else{
        max = valor2;
    }
        
    return max;
    }
    
    public static double minimo(double valor1, double valor2) {
    double mini;
    if (valor1 > valor2){
        mini = valor2;
    }
        
    else{
        mini = valor1;
    }
        
    return mini;
    }
}
