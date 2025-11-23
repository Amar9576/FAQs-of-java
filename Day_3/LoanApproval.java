/*Bank Loan Approval
--------------------------
Class Name: BankLoanApproval
Variables:
- int creditScore

Description:
A bank approves a loan if the applicant’s credit score is above or equal to 750.
Print "Loan Approved" or "Loan Rejected" using a ternary operator.

Sample Output:
Input: 760 → Output: Loan Approved
Input: 700 → Output: Loan Rejected
 */
package Day_3;

public class LoanApproval {
    public static void main (String []args){
        int creditScore=550;
        String Approved=(creditScore>=750)?"Loan Approved":"Loan Rejected";
        System.out.println("Loan Status:"+Approved);


    }
    
}
