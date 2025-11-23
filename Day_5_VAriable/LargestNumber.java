package Day_5_VAriable;
/* Find the largest of three numbers
Class Name: LargestNumber
Variables:
    int num1, num2, num3
Sample Input/Output:
    Input: 10, 25, 15 -> Output: Largest is 25
    Input: 7, 3, 5 -> Output: Largest is 7 */
import java.util.Scanner;
public class LargestNumber {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your 1st number :");
        int num1=sc.nextInt();
        System.out.println("Enter your 2nd number :");
        int num2=sc.nextInt();
        System.out.println("Enter your 3rd number :");
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Number 1 is larger than num2 and num3");

        }
        else if (num2>num1 && num2>num3){
            System.out.println("Number 2 is larger than num1 and num3 ");
        }
        else if(num3 >num1 && num3>num2) {
            System.out.println("number 3 is larger than num 1 and num2");

        }
        else {
            System.out.println("All num are equals ");
        }
    }
}
