/*Check if a number is positive or negative
Class Name: PositiveNegativeCheck
Variables:
    int number
Sample Input/Output:
    Input: 5 -> Output: Positive
    Input: -3 -> Output: Negative */
package Day_5_VAriable;
import java.util.*;
public class PositiveNegativeCheck {
     public static void main (String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("enetr your number ");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("pssitive");
                    
        }
        else {
            System.out.println("negative");
        }
    }
}  

