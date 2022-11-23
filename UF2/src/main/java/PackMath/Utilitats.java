/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackMath;

import java.util.Scanner;

/**
 *
 * @author somo4203
 */
public class Utilitats {
    
    
    public static int pedirValorPositivo()
    {
        Scanner sc = new Scanner(System.in);
        int valor;
        do{
            System.out.println("Pon un valor positivo");
            valor=sc.nextInt();
        }while(valor<=0);
        return valor;
    }
    
    public static int pedirValorPositivoFrase(String frase){
        Scanner sc = new Scanner(System.in);
        int valor;
        do{
            System.out.println(frase);
                    valor=sc.nextInt();
        }while(valor<=0);
        return valor;
    }
}
