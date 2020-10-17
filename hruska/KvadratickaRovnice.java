/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hruska;
import java.util.Scanner;
/**
 *
 * @author Benny
 */
public class KvadratickaRovnice {
        private static final Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Řešení kvadratické rovnice");
        System.out.println("Zadej koeficienty a,b,c");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        
        if(a == 0){
            if(b == 0){
                System.out.println("Nejedná se o rovnici!");
            }else{
                double x = -c /b;
                System.out.format("Řešením je x = %.5f %n", x);
            }
        }else{
            double d = b * b - 4 * a * c;
            double d2 = Math.sqrt(Math.abs(d));
            
            if(d < 0){
                double re = -b / (2*a);
                double im = Math.abs(d2/(2*a));
                
                System.out.format("Řešením je x1 = %.5f %n", re + im);
                System.out.format("Řešením je x2 = %.5f %n", re - im);
            }else{
                double x1 = (-b + d2)/(2*a);
                double x2 = (-b - d2)/(2*a);
                System.out.format("Řešením je x1 = %.5f %n", x1);
                System.out.format("Řešením je x2 = %.5f %n", x2);
            }
        }
    }
    
}
