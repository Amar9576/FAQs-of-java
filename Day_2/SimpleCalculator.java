/*Find the Largest of Three Numbers
Question: Write a Java program to find the largest among three numbers 
using if-else statements. */

package Day_2;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main (String []args){
        int num1,num2,result;
        char operator;
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter your numbers :");
         num1=sc.nextInt();

          System.out.println("enetr your char: ");
        operator =sc.next().charAt(0);
        
        System.out.println("enetr your number :");
         num2=sc.nextInt();

        switch(operator) {
        case '+':
        result=num1+num2;
        System.out.println(num1+"+"+num2+"="+result);
        break;
        
        case '-':
        result=num1-num2;
        System.out.println(num1+"-"+num2+"="+result);
        break;

        case '*':
        result=num1-num2;
        System.out.println(num1+"*"+num2+"="+result);
        break;

        case '/':
        result=num1-num2;
        System.out.println(num1+"/"+num2+"="+result);
        break;

        case '%':
        result=num1-num2;
        System.out.println(num1+"%"+num2+"="+result);
        break;
    }


    }
    
}
