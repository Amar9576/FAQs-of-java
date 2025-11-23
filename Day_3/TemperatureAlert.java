/*Temperature Alert System
--------------------------------
Class Name: TemperatureAlert
Variables:
- int temperature
Description:
A weather station records the temperature in degrees Celsius.
If the temperature is above or equal to 30, print "Hot Day", otherwise print "Pleasant Day".
Use ternary operator to implement the logic. */

package Day_3;
import java.util.Scanner;
public class TemperatureAlert {
    public static void main (String []args){
        int temp=20;
       // Scanner sc = new Scanner (System.in);
        System.out.println("Enter your tempertature: ");
      //  int tem= sc. nextInt();
        String weather=(temp>=30)?"Hot Day":"Cold Days";

       System.out.println("weather is :"+weather);



    }
    
}
