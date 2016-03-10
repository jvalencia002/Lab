/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.f4;

import java.util.Scanner;

/**
 *
 * @author Joeyvalencia
 */
public class LabF4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner( System.in);
        
        int Thirsty;
        int Breakfast;
       
        System.out.println("Start,");
        System.out.println("Im Hungry,");
        System.out.println("I get in line,");
        System.out.println("I buy Lunch,");
        System.out.println("are you thirsty? (0 = yes, 1 = no) : ");
        Thirsty = input.nextInt();
        if (Thirsty == 0){
            System.out.println(" did you have breakfast? ( 0 = yes, 1 = no) : ");
            Breakfast = input.nextInt();
            if (Breakfast == 0 )
                System.out.println("get diet coke");
            else 
                System.out.println("get coke");
            
        }
        System.out.println("get water");
        System.out.println("Eat Lunch");
        System.out.println("put my tray away");
        System.out.println("Leave");
        
       
        
    }
    
}
