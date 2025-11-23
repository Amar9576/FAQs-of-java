/* Electricity Bill Calculator
-----------------------------------
Class Name: ElectricityBill
Variables:
- int units
- int rate
- int billAmount

Description:
A power company charges:
- ₹5 per unit if consumption is 100 units or less
- ₹7 per unit if consumption is more than 100 units

Calculate the bill using the ternary operator to choose the per-unit rate.
Sample Output:
Input: 90 → Output: Total bill: ₹450
Input: 120 → Output: Total bill: ₹840 */
package Day_3;

public class ElectricityBill {
    public  static void main (String []args){
        int units=190;
        int rate=(units<=100)?5:7;
        int billAmounts=units*rate;
        System.out.println(billAmounts);

    }

    
}
