/* Print Multiplication Table
Question: Write a program to print the multiplication table of a given
number using a for loop.*/

package Day_2;

import java.util.Scanner ;

public class MulitiplicationUsingLoop {
    public static void main (String []args){
    
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your no...");
        int no= sc.nextInt();
        System.out.println("The table is :");
        
        for (int i=1;i<=10;i++){
           int result=no*i;
            
            System.out.println(no+"*"+i +"="+result);

        }
    }
    
}
