/*Check if a person is eligible to vote (age >= 18)
Class Name: VotingEligibility
Variables:
    int age
Sample Input/Output:
    Input: 20 -> Output: Eligible to vote
    Input: 15 -> Output: Not eligible to vote */
package Day_5_VAriable;
import java.util.Scanner;
public class votingEligibility {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enetr your no");
        int age=sc.nextInt();
        if (age>18){
            System.out.println("Eligible for voting");
        }
        else {
            System.out.println("Not Eligible For Voting");
        }
        }
    }

