/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionmillaskilo;

import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class FuncionMillasKilo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int millas;
        double km;
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe una distancia en millas");
        millas = sc.nextInt();
        km = millas_a_kilometros (millas);
        System.out.println("Los kilometros son " + km);
    }
    
    public static double millas_a_kilometros (int millas){
        double kil = 0;
        kil= millas * 1.60394;
        return kil;
    }
}
