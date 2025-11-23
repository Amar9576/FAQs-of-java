package Day_3;

import java.util.Scanner;

public class TernaryOperator {
    public  static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println ("enetr your no:");
        int marks= sc.nextInt();
        String result=(marks>33)?"pass":"fail";
        System.out.println(result);
        
    }
    
}
