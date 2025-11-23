/*Largest of Two Numbers
Write a Java program that takes two numbers and prints the largest using if-else.
*/

import java.util.Scanner;
public class LargestOfTwoNum {

    public static void main(String[]args){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1st no: ");
       
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("A is largest:" );
        }
        else if(b>a){
            System.out.println("B is largets: ");
        }
        else {
            System.out.println("Both are equals");
        }
    }
}
