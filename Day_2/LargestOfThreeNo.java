/*Find the Largest of Three Numbers
Question: Write a Java program to find the largest among three numbers 
using if-else statements. */ 


package Day_2;


import java.util.Scanner;

public class LargestOfThreeNo {
    public static void main (String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b||a>c){
            System.out.println("A is largest:"+a);
        } 
         else if (b>a||b>c){
            System.out.println("b is larger :"+b);
         } 
         else if (c>a||c>b){
            System.out.println("c is larger :"+c);

         }
         else {
            System.out.println("equlas");
         }
        }

    
}
