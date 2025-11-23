 /*VotingEligibility
Variables:
- int age

Description:
If the age is 18 or more, print "Eligible to Vote", otherwise print "Not Eligible".
Implement using the ternary operator.

Sample Output:
Input: 19 → Output: Eligible to Vote
Input: 16 → Output: Not Eligible
 */
package Day_3;

public class VotingEligibility {
    public static void main (String[]args){
        int age=67;
        String check=(age>=18)?"Eligible for Voting":"Not Eligible for Voting ";
        System.out.println(check);

    }

    
}
