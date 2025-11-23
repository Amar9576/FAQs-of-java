/*Train Ticket Fare Calculation
--------------------------------------
Class Name: TrainFareCalculator
Variables:
- int age
- int noOfTickets
- int ticketPrice
- int totalFare

Description:
Ticket prices:
- Adults: ₹100 per ticket
- Children (age < 12): ₹50 per ticket

Use ternary operator to select ticket price and calculate total fare.

Sample Output:
Input: age = 10, tickets = 3 → Output: Total Fare: ₹150
Input: age = 25, tickets = 2 → Output: Total Fare: ₹200 */
package Day_3;

import java.util.Scanner;

public class trainTicketfare {
    public void displayDetails(int age,int noOfTickets){
         //int age;
       // int noOfTickets;
        int ticketsPrice=(age>=12)?50:100;
        int totalFare=noOfTickets*ticketsPrice;

    }
    public  static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enetr your age ");
        int age=sc.nextInt();
        System.out.println("enetr your ticket");
        int noOfTickets=sc.nextInt();
        trainTicketfare calculator=new trainTicketfare();
        calculator.displayDetails(age, noOfTickets);


    }



    }
    

