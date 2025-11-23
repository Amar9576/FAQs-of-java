/*Check if a number is even or odd
Class Name: EvenOddCheck
Variables:
    int number
Sample Input/Output:
    Input: 8 -> Output: Even
    Input: 13 -> Output: Odd
 */
package Day_5_VAriable;
import java.util.Scanner;
public class EvenOddCheck {
    public static void main (String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enetr your no");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
