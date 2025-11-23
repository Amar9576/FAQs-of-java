import java .util.*;
public class CheckLeapYear {
    public static void  main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter yoour no: ");
        int leap=sc.nextInt();
        //int leap=2005;
        if (leap%4==0){
            System.out.println("its Leap year:"+leap);
        }
        else {
            System.out.println("It is not Leap year:");
        }

    }
}
    

