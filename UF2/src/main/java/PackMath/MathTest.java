/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackMath;

/**
 *
 * @author somo4203
 */
public class MathTest {
    public static void main(String[] args){
        int n1=5, n2=7;
        int maxim=Math.max(n1, n2);
        System.out.println("maxim es: " +maxim);
        double decimales = 345.678;
        long parteEntera = Math.round(decimales);
        System.out.println(parteEntera);
        int ran=(int)(Math.random()*10);
        System.out.println("Random " +ran);
        int neg=Math.negateExact(6);
        System.out.println("El negativo es: " +neg);
        double expo=Math.pow(5,3);
        System.out.println(5+" elevado a "+3+" es: "+expo);
    }
}
