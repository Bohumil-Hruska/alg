/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg3a;
import java.util.Scanner;
/**
 *
 * @author Benny
 */
public class Alg3a {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadejte koeficienty proměnných první rovnice");
        float a1 = sc.nextFloat();
        float b1 = sc.nextFloat();
        float c1 = sc.nextFloat();
        System.out.println("Zadejte koeficienty proměnných druhé rovnice");
        float a2 = sc.nextFloat();
        float b2 = sc.nextFloat();
        float c2 = sc.nextFloat();
        
        System.out.println("Vaše soustava rovnice vypada následovně:");
        System.out.println(a1+"x " + b1 +"y = " + c1 );
        System.out.println(a2+"x " + b2 +"y = " + c2 );
        
        if(a1 * b2 - a2 * b1 == 0){
            System.out.println((a1 * b2) - (a2 * b1));
            System.out.println("Rovnice nemá řešení!");
        }else{
         float x = (c1*b2 - b1*c2)/(a1 * b2 - a2 * b1);
         float y = (a1*c2 - c1*a2)/(a1 * b2 - a2 * b1);
         
            System.out.println("Řešením rovnice je: x= "+x+" a y= "+y);
        }
    }
}
