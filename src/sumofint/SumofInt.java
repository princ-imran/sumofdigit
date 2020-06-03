/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofint;

import java.util.Scanner;

/**
 *
 * @author Spy Hacker
 */
public class SumofInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        int reminder, number, sum = 0;
        Scanner scObj = new Scanner(System.in);
        System.out.print("Enter the number:");
        number = scObj.nextInt();
        while(number > 0)
        {
            reminder = number % 10;  
            sum = sum + reminder;
            number = number / 10;            
        }
        System.out.println("Sum of Digits:"+sum);

    }

   
    
}
