/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.f2;

import java.util.Scanner;

/**
 *
 * @author Joeyvalencia
 */
public class LabF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner( System.in);
        
        int Thirsty;
       
        System.out.println("Start,");
        System.out.println("Im Hungry,");
        System.out.println("I get in line,");
        System.out.println("I buy Lunch,");
        System.out.println("are you thirsty? (0 = yes, 1 = no) : ");
        Thirsty = input.nextInt();
        if (Thirsty == 0)
            System.out.println("buy a coke,");
        else System.out.println("Get H20");
        System.out.println("I eat lunch,");
        System.out.println("I leave!");
        
       
        
    }
    
}
