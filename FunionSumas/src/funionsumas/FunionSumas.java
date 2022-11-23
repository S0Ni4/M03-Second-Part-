/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funionsumas;

import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class FunionSumas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un numero");
        int n = sc.nextInt();
        
        int suma = suma1aN(n);
        System.out.println("La suma de los numeros es " + suma);
        int producto = producto1aN (n);
        System.out.println("El producto de los numeros es "+ producto);
        double inter = intermedio1aN(n);
        System.out.println("El numero intermedio es " +inter);
    }
    
    public static int suma1aN(int n){
        int suma =0;
        for (int i = 1; i <=n; i++) {
            suma = suma+i;
        }
        return suma;
    }
    public static int producto1aN (int n){
        int pro =1;
        for (int i = 1; i <=n; i++) {
            pro = pro*i;
        }
        return pro;
    }
    public static double intermedio1aN (int n){
        double mitad = (1+n)/2;
        return mitad;
    }
}
