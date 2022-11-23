/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivitat;

/**
 *
 * @author somo4203
 */
public class HipHurra {
    
    public static void main (String[] args){
        int n=6;
        salut(n);
    }
    
    public static void salut(int n){
        if (n==0){
            System.out.print("Hurra!!!");
        }
        else{
            System.out.print("Hip ");
            salut(n-1);
        }
    }
}
