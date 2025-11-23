/* Exam Grade Checker
---------------------------
Class Name: ExamGradeChecker
Variables:
- int marks

Description:
A student’s exam score is stored in a variable marks.
If the marks are 50 or more, print "Eligible for Certificate", otherwise print "Better Luck Next Time".
Use ternary operator to implement the logic.

Sample Output:
Input: 72 → Output: Eligible for Certificate
Input: 48 → Output: Better Luck Next Time */

package Day_3;

public class ExamGreadChecker {
    public static void main (String []args){
        int marks=40;
        String certificates=(marks>=50)?"Eligible for Certificate":"Better Luck Next Time";
        System.out.println(certificates);
        

    }
    
}
