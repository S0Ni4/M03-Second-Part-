/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2uf1ejercicio3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class Examen2UF1Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,calculo, res, error=0;
        Random r = new Random();
        Scanner sc = new Scanner (System.in);
        n = r.nextInt(10)+1;
        System.out.println("Tabla de mlutiplicar del " + n);
            for (int i = 0; i < 10; i++) {
            calculo = i * n;
            System.out.println(n+"x"+i+"=");
            res = sc.nextInt();
            if(res!=calculo){
                error++;
                System.out.println(">>>¡INCORRECTO!"+n+"x"+i+" es igual a "+calculo);
            }
            }
         System.out.println("Has tenido " +error+ " errores");
    }
    
}
