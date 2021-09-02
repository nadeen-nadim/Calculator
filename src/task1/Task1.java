/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nadeen Nadim
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void Operate()
    {
        
        Scanner scan = new Scanner(System.in);
          int operand =0;
          int firstNumber=0;
          int secondNumber=0;
            while(true)
            {
                try{
               System.out.println("Please choose the number corresponding to the operation you wish to perform:\n1.Additition\n2"
                       + ".Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.to quit");
               operand = scan.nextInt();
               
                if(operand==6)
                {
                    System.out.println("Good bye :)");
                    break;
                }
                else if(operand<=6 && operand>=1) {
                
                    System.out.println("Please enter the first number");
                    firstNumber = scan.nextInt();
                    System.out.println("Please enter the second number");
                    secondNumber = scan.nextInt();  
                }
                else
                {
                    System.out.println("invalid operator");
                }
                }
                catch(InputMismatchException e)
                {
                   System.out.println("Input cannot be a string"); 
                   scan.next();
                   continue;
                }
                
                if(operand ==1)
                {
                    System.out.println(firstNumber +" + " + secondNumber + " = " + (firstNumber+secondNumber));
                }
                else if(operand ==2)
                {
                    System.out.println(firstNumber +" - " + secondNumber + " = " + (firstNumber-secondNumber));
                }
                else if(operand ==3)
                {
                    System.out.println(firstNumber +" * " + secondNumber + " = " + (firstNumber*secondNumber));
                    
                }
                else if(operand ==4)
                {
                    try
                    {
                    System.out.println(firstNumber +" / " + secondNumber + " = " + (firstNumber/secondNumber));
                    }
                    catch(ArithmeticException e)
                    {
                        System.out.println("Can not divide by 0");
                    }
                    
                }
                else if(operand ==5)
                {
                    System.out.println(firstNumber +" % " + secondNumber + " = " + (firstNumber%secondNumber));   
                } 
        }
    }
    public static void main(String[] args) {    
        Operate();
    }
    
}
