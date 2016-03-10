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
        
        int thirst;
        int number1;
        int number2;
        
        
       
        System.out.print("thirst:");
        thirst = input.nextInt();
        
        System.out.print("get coke");
        number1 = input.nextInt();
        
        System.out.print("eat lunch");
        number2 = input.nextInt();
        
        System.out.printf("Start");
        
        System.out.printf("Im Hungry");
        
        System.out.printf("I get in line");
        
        System.out.printf("I buy Lunch");
        
        if (thirst == number1)
            System.out.printf("%d == %d\n", number1, number2);
        
        if( thirst != number2)
            System.out.printf("%d != %d\n", number1, number2);
        
        System.out.printf("I eat lunch");
        
        System.out.printf("I leave");
        
       
        
    }
    
}
