/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivitat;

/**
 *
 * @author somo4203
 */
public class Factorial {
    public static void main (String[] args){
        int valor = 1;
        System.out.println(valor+"! = "+factorial(valor));
    }
    
    public static int factorial (int n){
        if(n<=1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }  
    }
}
