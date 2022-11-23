/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivitat;

import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class EjerciciosRecursividad {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
//Ejercicio 1 
        /*System.out.println("Escribe el numero a sumar");
        int n = sc.nextInt();
        int suma = suma(n);
        System.out.println(suma);
        */
        
//Ejercicio 2
        /*System.out.println("Escribe la base");
        int base = sc.nextInt();
        System.out.println("Escribe la potencia");
        int po=sc.nextInt();
        
        int calculo=potencia(base, po);
        System.out.println("El resultado es "+calculo);
        */
        
//Ejercicio 3
        /*System.out.println("Escribe un numero mas grande de 2 para sumar los numeros pares");
        int n = sc.nextInt();
        int resultado = sumaPares(n);
        System.out.println(resultado);
        */
        
//Ejercicio 4
        /*System.out.println("Escribe un numero");
        int n = sc.nextInt();
        System.out.println("Escribe un segundo numero");
        int n2 = sc.nextInt();
        int sums = entreNumeros(n,n2);
        System.out.println("La suma entre los numeros es "+sums);
        */
       
//Ejercicio 5
        System.out.println("Escribe un numero");
        int n = sc.nextInt();
        inversion(n);
    }
       
//********************************************************************************************************************

// 1
    public static int suma(int n){
        int res;
        if(n<=1){
            return 1;
        }
        else if(n>1) {
            res=n+suma(n-1);
            return res;
        }
        return -1;
    }

// 2
    public static int potencia(int n, int p){
        if(p==0){
            return 1;
        }
        else if (p>=1){
            return n*potencia(n, p-1);
        }
        return -1;
    }

// 3
    public static int sumaPares (int n){
        if(n==2){
            return n;
        }
        else if(n%2==1) {
            return -1;
        }
        else {
            return n+sumaPares(n-2);
        }
    }
    
// 4
    public static int entreNumeros (int n, int n2){
        int v1;
        if(n>n2){
            v1=n2;
            n2=n;
            n=n2;
        }
        if (n==n2){
            return n2;
        }
        else{
            return n2+entreNumeros(n,n2-1);
        }
    }
    
// 5
    public static void inversion(int n){
        if(n<10){
            System.out.println(n);
        }
        else {
            System.out.print(n%10);
            inversion(n/10);
        }
    } 
}
