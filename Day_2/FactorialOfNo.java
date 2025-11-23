 /*Factorial of a Number
Question: Write a Java program to calculate the factorial of a number using 
a loop.*/




package Day_2;

import java.util.Scanner;

public class FactorialOfNo {
    public  static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enetr your no :");
         
        int no= sc. nextInt();
        long fact=1;
        if (no<=0){
            System.out.println("no is neagtive ");
        }
        else {
        for (int i=1;i<=no;i++){
           fact*=i;
        
        System.out.println(no +"is factorial"+ fact);

        }
    }

    }
    
}
