/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array10enteros;

import Utilitats.Utilitats;
import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class Array10Enteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]valores=new int[10];
        char opcion;
        do{
            opcion=menu();
            switch (opcion){
                case 'a':
                    Utilitats.mostrarArray(valores);
                    break;
                case 'b':
                    cambiarValor(valores);
                    break;
                case 'c':
                    System.out.println("Saliendo...");
                    break;
            }
        }while(opcion!='c');
    }
    
    public static char menu()
    {
        Scanner sc = new Scanner(System.in);
        char letra=' ';
        do{
            System.out.println("a. Mostrar valores.\n"+
                    "b. Introducir valor. \n"+
                    "c. Salir.");
            System.out.print("Escribe opcion:");
            letra=sc.nextLine().charAt(0);
        }while(letra<'a'||letra>'c');
        return letra;
    }    

    private static void cambiarValor(int[] valores) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un valor");
        int v = sc.nextInt();
        int pos;
        do{
            System.out.println("Pon posicion 1-"+valores.length);
            pos=sc.nextInt();
        }while(pos<1 || pos>valores.length);
        valores[pos-1]=v;
    }
}
