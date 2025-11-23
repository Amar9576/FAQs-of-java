package Day_4;

import java.util.Scanner;

public class DiscountCalculator {
     double totalCost;
        double discount;
        double finalAmount;
    public static  void main(String []args){
        Scanner sc = new Scanner (System.in);
        double d1= sc.nextDouble();
       
        if(totalCost>10000){
            System.out.println("5% discount");
           // discount=finalAmount*0.5/100;
        }
            else if((totalCost>10000) && (totalCost<50000)){
                System.out.println("15% discount");
               // discount=finalAmount*0.15/100;

            }
            else if(totalCost>50000 && totalCost<800000){
                System.out.println("20% discount");
               // discount=finalAmount*0.25/100;
            }
            else {
                System.out.println("35% discount");
               // discount=finalAmount*0.35/100;
            }
        }
    }

