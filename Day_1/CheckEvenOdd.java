/*Check if a Number is Even or Odd
Write a program to craete a variable, assign an integer to it.
Check and print whether it’s even or odd.*/
import java.util.*;
public class CheckEvenOdd {
    public static void main (String []args){
       // int num=57;
       Scanner sc = new Scanner (System.in);
       System.out.println("enetr your no:");
       int num = sc.nextInt();
        if (num%2==0){
            System.out.println("It is Even No: "+num);
        }
        else {
            System.out.println("It is odd no: "+num);
        }
    }
    
}
