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
public class TestICO {
    private static final Scanner sc = new Scanner(System.in);
    private static int z;
    private static int soucet = 0;
    private static int multi = 8;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Zadejte IČO: ");
        int ico = sc.nextInt();
        int checkNum = ico-((ico/10)*10);
            for(int i = 100000000; i > 10; i = i/10){
                z = ((ico/(i/10))-((ico/i)*10))*multi;
                multi = multi-1;
                System.out.println(z);
                soucet += z;
            }       
        System.out.println("Kontrolní součet je: " + soucet);
        int n = (11-(soucet%11))%10;
        if((11-(soucet%11))%10 == checkNum){
            System.out.println("Jedná se o validní IČO!");
        }else{
            System.out.println("IČO není validní!");
        }
    }
    
}
