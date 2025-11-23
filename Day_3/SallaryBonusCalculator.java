/*Salary Bonus Decision
------------------------------
Class Name: SalaryBonusCalculator
Variables:
- double salary
- int yearsOfService
- double bonus
- double finalSalary

Description:
A company gives:
- 15% bonus if yearsOfService is 5 or more
- 5% bonus if less than 5 years

Calculate the final salary after adding the bonus using ternary operator.

Sample Output:
Input: ₹40000, 6 years → Output: Final Salary: ₹46000.0
Input: ₹30000, 3 years → Output: Final Salary: ₹31500.0 */

package Day_3;

import java.util.Scanner;

public class SallaryBonusCalculator {
    public void displayDetails(double sallary, int yearOfService){
        double bonus = (yearOfService >= 5) ? (sallary * 0.15) : (sallary * 0.05);
        double finalSallary = sallary + bonus;
        System.out.println("Final Salary: ₹" + finalSallary);
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter your years of service: ");
        int yearsOfService = sc.nextInt();
        
        SallaryBonusCalculator calculator = new SallaryBonusCalculator();
        calculator.displayDetails(salary, yearsOfService);
    }
}
