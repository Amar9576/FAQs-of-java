/* Check if a year is a leap year
Class Name: LeapYearCheck
Variables:
    int year
Sample Input/Output:
    Input: 2024 -> Output: Leap year
    Input: 2023 -> Output: Not leap year*/
package Day_5_VAriable;
import java.util.Scanner;
public class LeapYearCheck {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your no");
        int year=sc.nextInt();
        if((year%100==0)||(year%4==0) && (year%100!=0)){
            System.out.println("Leap year ");

        }
        else {
            System.out.println("Not Leap year ");
        }
    }
}
