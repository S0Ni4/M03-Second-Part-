/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraytest;

import Utilitats.Utilitats;
import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class ArrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num_notas=4;
        int[] notes = new int[num_notas];
        notes[0]=3;
        notes[1]=4;
        notes[2]=7;
        notes[3]=1;
        
        System.out.println("Mostrar posicion array");
        Utilitats.mostrarArray(notes);
        
       /* int[] notes2 = new int[num_notas];
        notes2[0]=13;
        notes2[1]=14;
        notes2[2]=17;
        notes2[5]=11;
        Utilitats.mostrarArray(notes2); //Al ser iguales (array) te lo acepta
        //En el for no hay que usar (=) sino te dará error.
        */
       
        int suma;
        double media;
        suma = calcularSumaNotas(notes);

        media=(double)suma/notes.length;
        System.out.println("La nota media es " +media);
        
        //Inicializar Array
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon tus notas");
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Introdueix la nota " +(i+1));
            notes[i]=sc.nextInt();     
        }
        suma = calcularSumaNotas(notes);
        media=(double)suma/notes.length;
        System.out.println("La media de tus notas es " +media); 
        
        //Copiar Array
        int[] copia_notes=new int[num_notas];
        for (int i = 0; i < notes.length; i++) {
            copia_notes[i]=notes[i];
        }
        System.out.println("Array Copia");
        Utilitats.mostrarArray(copia_notes);
    }

    private static int calcularSumaNotas(int []notes) {
        int suma=0;
        for (int i = 0; i < notes.length; i++) {
            //System.out.println("Posicion "+i+" Acumulo el valor " +notes[i]);
            suma = suma + notes[i];
            //System.out.println("Acumulado por ahora " +suma);
        }
        return suma;
    }  
}
