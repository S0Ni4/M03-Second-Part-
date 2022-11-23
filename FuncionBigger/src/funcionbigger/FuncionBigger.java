/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionbigger;

import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class FuncionBigger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, n2, n3;
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe un numero");
        n = sc.nextInt();
        System.out.println("Escribe un segundo numero");
        n2 = sc.nextInt();
        System.out.println("Escribe un tercer numero");
        n3 = sc.nextInt();
        
        int mayor = mayor(n, n2);
        mayor = mayor(n3, mayor);
        System.out.println("El mayor numero es " +mayor);
        
    }
    
    public static int mayor (int n, int n2){
        int mayor;
        if(n>n2){
            mayor = n;
        }
        else{
            mayor = n2;
        }
        return mayor;     
    }  
}
