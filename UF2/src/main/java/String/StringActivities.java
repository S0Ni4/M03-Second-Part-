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
public class StringActivities {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe la frase que quieres");
        String frase = sc.nextLine();
        int letras=frase(frase);
        System.out.println(letras);
        quote(frase);
        String gujeol = gujeol(frase);
        int nA=contarA(frase);
        System.out.println("El numero de a's es: " +nA);
        int nV=contarVocales(frase);
        System.out.println("El numero de vocales es: " +nV);
        System.out.println("Pon el caracter que quieres contar de la frase");
        char letra =sc.next().charAt(0);
        int numCar = contarCaracterFrase(frase, letra);
        System.out.println("La letra " +letra+ " esta " +numCar);
        SinEspacio(frase);
    }
    
    public static int frase(String frase){
        int num=frase.length();
        return num;
    }
    
    public static void quote(String q){
        System.out.println(q.toUpperCase());
        System.out.println(q.toLowerCase());
    }
    
    public static String gujeol(String gu){
        for (int i = 0; i < gu.length(); i++) {
            System.out.println(gu.charAt(i));
        }
        return gu;
    }
    
    public static int contarA(String frase){
        int cont=0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)=='a'){
                cont++;
            }           
        }
        return cont;
    }
    
    public static int contarVocales(String frase){
        int cont=0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)=='a'||frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u'){
                System.out.println("Cantidad de vocales: " +cont);
                cont++;
            }           
        }
        return cont;
    }
    
    private static int contarCaracterFrase(String frase, char letra){
        int cont=0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)==letra){
                cont++;
            }     
        }
        return cont;
    }
    
    private static void SinEspacio(String frase){
        System.out.println(frase.replace("",""));
    }
}
