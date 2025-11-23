/* E-commerce Discount Application
----------------------------------------
Class Name: ECommerceDiscount
Variables:
- double purchaseAmount
- double discountRate
- double finalPrice

Description:
An e-commerce store offers:
- 20% discount if the purchase amount is ₹2000 or more
- 10% discount if less than ₹2000

Use the ternary operator to determine the discount rate, calculate, and print final price.

Sample Output:
Input: ₹2500 → Output: Final Price: ₹2000.0
Input: ₹1500 → Output: Final Price: ₹1350.0
 */
package Day_3;

public class E_commerceBill {
    public static void main (String []args){
        double purchaceAmount=1500;
        double discountRate=(purchaceAmount>=2000)?20:10;
        double finalPrice=( purchaceAmount*discountRate )/ 100;
        System.out.println(finalPrice);
        
        
    }
    
}
