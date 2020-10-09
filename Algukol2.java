/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algukol2;

import java.util.Scanner;

public class Algukol2 {

    public static double aSide;
    public static double bSide;
    public static double cSide;
    public static double capacity;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Rozměry zadávejte v cm!");
        System.out.print("Zadejte rozměr strany 'a': ");
        aSide = sc.nextDouble();
        System.out.print("Zadejte rozměr strany 'b': ");
        bSide = sc.nextDouble();
        System.out.print("Zadejte rozměr strany 'c': ");
        cSide = sc.nextDouble();

        capacity = aSide * bSide * cSide;
        System.out.println("Objem kvádru je: " + capacity + " cm3!");
        
        double krSide = Math.cbrt(capacity);
        System.out.println("Délka strany krychle je: " + krSide + " cm!");
        
        double halfCir = Math.cbrt((3*capacity)/(4*Math.PI));
        System.out.println("Poloměr kružnice je: " + halfCir + " cm!");
        
        double ctyrstSide = Math.cbrt((12*capacity)/Math.sqrt(2));
        System.out.println("Délka strany pravidelného čtyřstěnu je: " + ctyrstSide + " cm!");
        
        System.out.println("");
        System.out.println("Část2:");
        double area = 2*((aSide * bSide)+(bSide * cSide)+(aSide * cSide));
        System.out.println("Plocha kvádru je: " + area + " cm2!");
        
        krSide = Math.sqrt(area/6);
        System.out.println("Délka strany krychle je: " + krSide + " cm!");
        
        halfCir = Math.sqrt(area/(4*Math.PI));
        System.out.println("Poloměr kružnice je: " + halfCir + " cm!");
        
        ctyrstSide = Math.sqrt(area/Math.sqrt(3));
        System.out.println("Délka strany pravidelného čtyřstěnu je: " + ctyrstSide + " cm!");
        
        

    }

}
