/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionmulti;

import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class FuncionMulti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un numero");
        int n = sc.nextInt();
        tabla(n);        
    }
    public static void tabla (int n){
        int calculo;
        for (int i = 1; i <=10; i++) {
            calculo = i*n;
            System.out.println(i + "x" +n+ "=" +calculo);
        }   
    }  
}
