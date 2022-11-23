/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class StringTest {
    
    public static void main(String[] args){
        int x=3;
        String frase="Hola";
        System.out.println(frase + x);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        frase=sc.nextLine().toUpperCase();
        
        /*char letra=frase.charAt(3);
        System.out.println("La letra en posicion 3 es la "+letra);
        System.out.println("La frase tiene "+ frase.length());
        for (int i = 0; i < frase.length(); i++) {
            System.out.println("En la posicion " +i+" hay el caracter "+frase.charAt(i));
        }
        
        String f1="hola que tal";
        String f2="hola que tal";
        //equalsIgnoreCase no le importan las mayusculas ni las minusculas.
        if(f1.equalsIgnoreCase(f2)){
            System.out.println("Frase igual");
        }
        else{
            System.out.println("Frase diferente");
        }*/
        
        if(frase.endsWith("A") && frase.startsWith("H")){
            System.out.println("La frase termina con 'a' y empieza con 'H'");
        }
    }  
}
