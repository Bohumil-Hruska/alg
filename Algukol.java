/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algukol;
import java.util.Scanner;
/**
 *
 * @author Benny
 */
public class Algukol {

    public static int max_speed;
    public static float lenght;
    public static int inHour;
    public static int inMin;
    public static int inSec;
    public static int inSet;
    public static int outHour;
    public static int outMin;
    public static int outSec;
    public static int outSet;
    public static int hourToMin = 60;
    public static int hourToSec = 3600;
    public static float avgSpeed;
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Zadejte maximální povolenou rychlost: ");
    max_speed = sc.nextInt();
    System.out.print("Zadejte délku měřeného úseku (v metrech): ");
    lenght = sc.nextFloat();
    
    System.out.print("Zadejte časový údaj vjezdu do úseku (hh:mm:ss:tt): ");
    inHour = sc.nextInt();
    inMin = sc.nextInt();
    inSec = sc.nextInt();
    inSet = sc.nextInt();
    
    System.out.print("Zadejte časový údaj odjezdu z úseku (hh:mm:ss:tt): ");
    outHour = sc.nextInt();
    outMin = sc.nextInt();
    outSec = sc.nextInt();
    outSet = sc.nextInt();
    
    int sumIn = (inHour * hourToSec) + (inMin * hourToMin) + inSec + (inSet / hourToMin);
    int sumOut = (outHour * hourToSec) + (outMin * hourToMin) + outSec + (outSet / hourToMin);
    float sumTime = (float)sumOut - (float)sumIn;
    System.out.println("Celková doba průjezdu trvala: " + (sumTime) + "sekund!");
    
    avgSpeed = (lenght/1000) / (sumTime / hourToSec);
    
    System.out.println("Průměrná rychlost vozidla je: " + avgSpeed + "km/h!");
    
    if(avgSpeed > max_speed)
    {
        String speedDif;
        String[] ret = {"Výše pokuty je do 1000Kč!",
            "Výše pokuty je do 1000Kč a 2 trestné body!",
            "Výše pokuty je do 2500Kč a 3 trestné body!",
            "Výše pokuty je do 2500Kč a 3 trestné body!",
            "Čeká Vás správní řízení a pokuta do 10 000Kč a 5 trestných bodů!"};
        
        speedDif = (avgSpeed-max_speed) < 6 ? ret[0] 
                : ((avgSpeed-max_speed) < 19 ? ret[1] 
                : ((avgSpeed-max_speed) < 39 ? ret[2] 
                : ((avgSpeed-max_speed) < 39 ? ret[3] : ret[4])));
        
        /*if((avgSpeed - max_speed) < 6){
            System.out.print("Výše pokuty je do 1000Kč");
        }else if((avgSpeed - max_speed) < 19){
            System.out.print("Výše pokuty je do 1000Kč a 2 trestné body!");
        }else if((avgSpeed - max_speed) < 39){
            System.out.print("Výše pokuty je do 2500Kč a 3 trestné body!");
        }else{
            System.out.print("Čeká Vás správní řízení a pokuta do 10 000Kč a 5 trestných bodů!");
        }*/
        
        System.out.print(speedDif);
    }else{
    System.out.print("Vaše rychlost je v pořádku!");
    }
    }
    
}
