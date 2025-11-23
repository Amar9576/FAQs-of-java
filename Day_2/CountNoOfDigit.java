/* Count Digits in a Number
Question: Write a Java program to count the number of digits in a given
integer. */
package Day_2;
import java.util.Scanner;
public class CountNoOfDigit {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enetr your no");
        long no=sc.nextLong();
        int count=0;
        if (no==0){
            count=1;
        }
        else {
            while(no>0){
                no/=10;
                count++;
            }
        }
         System.out.println(count);
        }
    }
    
