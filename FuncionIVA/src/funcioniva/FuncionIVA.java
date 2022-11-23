/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcioniva;

import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class FuncionIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double precio;
        double precioFinal;
        for (int i = 0; i <5; i++) {
          System.out.println("Escribe un precio");
          precio = sc.nextDouble();
          precioFinal = precioConIVA(precio);
          System.out.println("El precio final es " +precioFinal);
        }
 
    }
    
    public static double precioConIVA(double precio){
        double iva = precio*1.21;
        return iva;
    }
    
}
