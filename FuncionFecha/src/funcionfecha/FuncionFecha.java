/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionfecha;

import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class FuncionFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe un dia");
        int dia = sc.nextInt();
        System.out.println("Escribe el numero de un mes");
        int mes = sc.nextInt();
        System.out.println("Escribe un año");
        int anyo= sc.nextInt();
        
        boolean fecha = fechaCorrecta (dia, mes, anyo);
        if(fecha==true){
            System.out.println("FECHA CORRECTA");
        }
        else{
            System.out.println("FECHA INCORRECTA");
        }
    }
    
    public static boolean fechaCorrecta ( int dia, int mes,int anyo){
        boolean correct=true;
        if (dia<1 || dia>30){
            return false;
        }
        else if (mes<1 || mes>12){
            return false;
        }
        else if (anyo<1900){
            return false;
        }
        return correct;
    }  
}
